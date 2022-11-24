import axios from 'axios';
import React from 'react';
import { useEffect} from 'react';
function App() {
  const url ="http://localhost:8889/smart/home/main";
  //backend 연동 url 생성
  useEffect(() => {
      axios
      .get(url,{
        headers:{
        "Content-Type":"application/json",
      },
    })
      .then((res,err) => {
          console.log(res)
      });
    }, []
);

  return (
    <div>
      hello
    </div>
  );
}

export default App;
