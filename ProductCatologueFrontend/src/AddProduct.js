import React from 'react'

const AddProduct = ({handleSubmit,productCategory,productPrice,productName,setproductCategory,setproductPrice,setproductTitle,handleAlertClick}) => {
  return (
    
    
       //Form display the Add product detail page and is Added to respected api using handlesubmit call
        <form className='searchForm' onSubmit={handleSubmit}>
           <h2>Add new Product</h2>
            <label htmlFor='productTitle'>Product Name</label>
            <input 
            id='productTitle'
            type='text'
            required
            value={productName}
            onChange={(e)=>setproductTitle(e.target.value)}></input>

            <label htmlFor='productPrice'>Product Price</label>
            <input 
            id='productPrice'
            type='text'
            required
            value={productPrice}
            onChange={(e)=>setproductPrice(e.target.value)}></input>

            <label htmlFor='productCategory'>Product Category</label>
            <input 
            id='productCategory'
            type='text'
            required
            value={productCategory}
            onChange={(e)=>setproductCategory(e.target.value)}></input>
            <button type='submit' onClick={handleAlertClick}>Add Product</button>

        </form>
     
   
  )
}

export default AddProduct
