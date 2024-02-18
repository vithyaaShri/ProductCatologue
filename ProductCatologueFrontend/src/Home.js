import React from 'react'
import { Link } from 'react-router-dom'
//This is hoe page which has two buttons and navigated to respective pages when clicked on button
const Home = () => {
  return (
    
      <body>
        <button className="button" ><Link to='/addProduct' className="buttonComp">Add Product</Link></button>
        <button className="button" ><Link to='/displayProduct'className="buttonComp">Display Product</Link></button>
      </body>
    
  )
}

export default Home
