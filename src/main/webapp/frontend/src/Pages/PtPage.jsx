import React from 'react'
import ItemBox from '../Components/ItemBox'

const PtPage = () => {
  return (
    <div className='divStyle'>
      <h4>트레이너를 선택하세요</h4>
      <div>
        <ItemBox title="민성조"/>
        <ItemBox title="김누리"/>
        <ItemBox title="김정우"/>
        <ItemBox title="문재승"/>
      </div>
    </div>
  )
}

export default PtPage