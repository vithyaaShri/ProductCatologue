import Header from "./Header";
import Footer from "./Footer";
import Home from "./Home";
import AddProduct from "./AddProduct";
import DisplayProduct from "./DisplayProduct";
import Missing from "./Missing";
import {Link,Navigate,Route, Routes } from "react-router-dom";
import { useEffect, useState } from "react";
import api from "./api/product";
import Swal from "sweetalert2";


function App() {
//product is an array used to store product details
  const[product,setProduct]=useState([])
//Name of the ptoduct
  const [productName,setproductTitle]=useState('')
//Price of the product
  const [productPrice,setproductPrice]=useState('')
//product category use state
  const[productCategory,setproductCategory]=useState('')


//handleSubmit is used to Add product details to the api
  const handleSubmit=async (e)=>{
    e.preventDefault();
    const id=product.length>0?product[product.length-1].id+1:1;
    const newProduct1={id,productName:productName,price:productPrice,category:productCategory};
    try{
    const response=await api.post('http://localhost:8080/product/post',newProduct1);
    const allproduct=[...product,response.data];
    setProduct(allproduct);
    setproductTitle('');
    setproductPrice('');
    setproductCategory('');
    Navigate('http://localhost:3000');
    }catch(err){
      if(err.response){
        console.log(err.response.data);
        console.log(err.response.status);
        console.log(err.response.headers);
      }else{
        console.log(`${err.message}`);
      }
    }
    
  }
//Used to dispaly alert message after clicking button "AddProduct"
  const handleAlertClick=()=>{
    Swal.fire("Product Added Succesfully");

  }
//Used to fetch the fetch the data from a different api
//Axios is used to fetch the items
  useEffect(()=>{
    const fetchProduct=async()=>{
      try{
        const response=await api.get('http://localhost:8080/product');
        setProduct(response.data);
        console.log(response.data);

      }catch(err){
        if(err.response){
          console.log(err.response.data);
          console.log(err.response.status);
          console.log(err.response.headers);
        }else{
          console.log(`${err.message}`);
        }
      }
  }
  fetchProduct();
},[])

//Used RouteS concept to navigate to single page applications

  return (
    <div className="App">
      <Header /> 
      <Routes>

      <Route path="/" element={<Home />}/>
        <Route path="/addProduct" element={<AddProduct 
        productName={productName} setproductTitle={setproductTitle}
        productPrice={productPrice} setproductPrice={setproductPrice}
        productCategory={productCategory}
        setproductCategory={setproductCategory} handleSubmit={handleSubmit}
          handleAlertClick={handleAlertClick}
        />}/>

        <Route path="/displayProduct" element={<DisplayProduct product={product} index={1}/>}/>

        <Route path="*" element={<Missing/>}/>
      </Routes>
      <Footer/>
    </div>
  );
}

export default App;
