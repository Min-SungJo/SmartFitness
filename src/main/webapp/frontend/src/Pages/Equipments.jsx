import React from 'react'
import ItemBox from '../Components/ItemBox'

const Equipments = () => {
  return (
    <div className='divStyle'>
      운동기구 안내 페이지입니다
      <h4></h4>
        <div>
          <ItemBox title="유산소"/>
          <ItemBox title="근력운동"/>
        </div>
    </div>
  )
}

export default Equipments