import React from 'react'
//This displays the product details in page
const Table = ({product,index}) => {
  return (
    <div>
      < table className='table'>
        <tbody>
          <tr className='tr'>
            <th>NAME</th>
            <th>PRICE</th>
            <th>CATEGORY</th>
          </tr>
            {product.map(item=>(
                <tr className='tr1' key={index} item={item}>
                  <td className='td'>{item.productName}</td>
                  <td className='td'>{item.price}</td>
                  <td className='td'>{item.category}</td>
                </tr>
                ))}    
        </tbody>
      </table>
      </div>
  )
}

export default Table
