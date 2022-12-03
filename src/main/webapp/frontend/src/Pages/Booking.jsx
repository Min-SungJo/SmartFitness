import React from 'react'
import ItemBox, { Box } from '../Components/ItemBox'

const Booking = () => {
  return (
    <div className='divStyle'>
        Booking!
        <div>
        <ItemBox title="단체운동예약"/>
        <ItemBox title="개인운동예약"/>
        <ItemBox title="운동기구예약"/>
        </div>
    </div>
  )
}

export default Booking