import React, { useEffect } from 'react'
import Table from './Table'

//Table display and this page navigate to Table.js
const DisplayProduct = ({product,index}) => {  
  return (
   <>
    <Table product={product} index={index}/>
    </>
  )
}

export default DisplayProduct
