import React from 'react'

const Footer = () => {
//Display the footer of the page
    const year=new Date();
  return (
    <div className='Footer'>
      Copyright &copy; {year.getFullYear()}
    </div>
  )
}

export default Footer
