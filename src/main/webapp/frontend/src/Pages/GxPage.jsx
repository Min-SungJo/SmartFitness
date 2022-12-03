import React from 'react'
import ItemBox from '../Components/ItemBox'

const GxPage = () => {
  return (
    <div className='divStyle'>
      <h5>2022/12/01<p>오늘의 단체 클래스 스케줄</p></h5>
      <div>
      <ItemBox title="필라테스"/>
      <ItemBox title="바디컴뱃"/>
      <ItemBox title="스피닝"/>
      </div>
    </div>
  )
}

export default GxPage