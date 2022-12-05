import React from 'react'
import Table from '../Components/Table'

const GxPage = () => {
  return (
    <div className='divStyle'>
      <h5>2022/12/01<p>오늘의 단체 클래스 스케줄</p></h5>
      
      <div className='itemBox_div'>
        <h1>필라테스</h1>
          <Table/>

      </div>

      <div className='itemBox_div'>
      <table className='gx_table'>
          <thead>
            <tr>
              <th>시간</th>
              <th>예약</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>11:00</td>
              <td>예약</td>
            </tr>
            <tr>
              <td>12:00</td>
              <td>예약</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='itemBox_div'>
      <table className='gx_table'>
          <thead>
            <tr>
              <th>시간</th>
              <th>예약</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>11:00</td>
              <td>예약</td>
            </tr>
            <tr>
              <td>12:00</td>
              <td>예약</td>
            </tr>
          </tbody>
        </table>
      </div>
      </div>
      
  )
}

export default GxPage