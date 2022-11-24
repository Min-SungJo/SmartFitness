import React from 'react'
import { Link } from 'react-router-dom'

const NavBar = () => {
  return (
    <div className='navBar'>
        <Link to ='/'><h1>Smart <span>Fitness</span></h1></Link>

        <div className='navBar_menu'>
            <Link to = 'gx-class' ><p>단체수업</p></Link>
            <Link to = 'pt-class' ><p>개인운동</p></Link>
            <Link to = 'equipments' ><p>기구안내</p></Link>
            <Link to = 'booking' ><p>예약페이지</p></Link>
            <Link to = 'contact' ><p>문의페이지</p></Link>
        </div>

        <div className='navBar_login'>
          <Link to='join'><p>JOIN</p></Link>
          <Link to='login'><p>LOGIN</p></Link>
        </div>
    </div>
  )
}

export default NavBar