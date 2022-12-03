import React from 'react'

const Contact = () => {
  return (
    <div className='divStyle'>
      Contact Us!
      <form>
        {/* category */}
        <select>
          <option> 문의 내용을 선택하세요</option>
          <option>1. 회원가입 문의</option>
          <option>2. 홈페이지 이용 문의</option>
          <option>3. 이용권 문의</option>
          <option>4. 시설문의</option>
          <option>5. 기타문의</option>
        </select>

        {/* title */}
        <input type="text" placeholder='문의 내용을 간략히 적어주세요'/>

        {/* content */}
        <textarea placeholder='문의 내용을 자세히 적어주세요'/>

        {/* 파일첨부 */}
        <input type="file"/>

        <input type="submit" value="문의하기"/>

      </form>



    </div>
  )
}

export default Contact