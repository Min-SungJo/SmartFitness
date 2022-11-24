import React from 'react';
import { Route, Routes } from 'react-router-dom';

import './Scss/body.scss';
import './Scss/navBar.scss'

import Main from './Pages/Main';
import NavBar from './Pages/NavBar';
import GxPage from './Pages/GxPage'
import PtPage from './Pages/PtPage';
import Equipments from './Pages/Equipments';
import Booking from './Pages/Booking';
import Contact from './Pages/Contact';
import Login from './Pages/Login';
import Join from './Pages/Join';
import Footer from './Components/Footer';



function App() {


//   const url ="http://localhost:8889/smart/home/main";
//   //backend 연동 url 생성
//   useEffect(() => {
//       axios
//       .get(url,{
//         headers:{
//         "Content-Type":"application/json",
//       },
//     })
//       .then((res,err) => {
//           console.log(res)
//       });
//     }, []
// );

  return (
    <>
    <NavBar/>

    <Routes>
      <Route path='/' element={<Main/>} />
      <Route path='/gx-class' element={<GxPage/>} />
      <Route path='/pt-class' element={<PtPage/>} />
      <Route path='/equipments' element={<Equipments/>} />
      <Route path='/booking' element={<Booking/>} />
      <Route path='/contact' element={<Contact/>} />
      <Route path='/join' element={<Join/>} />
      <Route path='/login' element={<Login/>} />
    </Routes>

    <Footer/>
    </>
  );
}

export default App;
