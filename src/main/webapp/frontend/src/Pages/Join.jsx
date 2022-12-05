import React from 'react'
import * as Yup from "yup";
import { useNavigate } from 'react-router-dom'
import {Button, TextField} from "@mui/material";
import { Formik } from 'formik';


const Join = () => {

  const navigate = useNavigate();

  const validationSchema = Yup.object().shape({
    email: Yup.string()
      .email("올바른 이메일 형식이 아닙니다!")
      .required("이메일을 입력하세요!"),
    username: Yup.string()
      .min(2, "이름은 최소 2글자 이상입니다!")
      .max(10, "이름은 최대 10글자입니다!")
      .matches(
        /^[가-힣a-zA-Z][0-9 ^!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?\s]*$/,
        "이름은 한글, 영문만 작성 가능합니다!"
      )
      .required("이름을 입력하세요!"),
    password: Yup.string()
      .min(8, "비밀번호는 최소 8자리 이상입니다")
      .max(16, "비밀번호는 최대 16자리입니다!")
      .required("패스워드를 입력하세요!")
      .matches(
        /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?])[^\s]*$/,
        "알파벳, 숫자, 공백을 제외한 특수문자를 모두 포함해야 합니다!"
      ),
    password2: Yup.string()
      .oneOf([Yup.ref("password"), null], "비밀번호가 일치하지 않습니다!")
      .required("필수 입력 값입니다!"),
  });


  return (

      <div className='join_div'>
        <h1>Join Us</h1>
      <Formik
      initialValues={{
        email: "",
        username: "",
        password: "",
        password2: "",
      }}
      validationSchema={validationSchema}
      onSubmit="submit"
      validateOnMount={true}
      >
      {({values, handleSubmit, handleChange, errors}) => (
        <div className="signup-wrapper">
         
          <form onSubmit={handleSubmit} autoComplete="off">
            <div className="input-forms">
              <div className="input-forms-item">
                <TextField
                  value={values.email}
                  name="email"
                  variant="outlined"
                  onChange={handleChange}
                  placeholder="E-mail"/>
                <div className="error-message">
                  {errors.email}
                </div>
                
              </div>
              <div className="input-forms-item">
                <TextField
                  value={values.username}
                  name="username"
                  variant="outlined"
                  onChange={handleChange}
                  placeholder="이름"
                  />
                <div className="error-message">
                  {errors.username}
                </div>

              </div>
              <div className="input-forms-item">
                <TextField
                  value={values.password}
                  name="password"
                  variant="outlined"
                  type="password"
                  onChange={handleChange}
                  placeholder="비밀번호 입력(문자,숫자,특수문자 포함 8~16) "
                  />
                <div className="error-message">
                  {errors.password}
                </div>

              </div>
              <div className="input-forms-item">
                <TextField
                  value={values.password2}
                  name="password2"
                  variant="outlined"
                  type="password"
                  onChange={handleChange}
                  placeholder="비밀번호 확인"
                  />

                <div className="error-message">
                  {errors.password2}
                </div>

              </div>
              <Button
                color="primary"
                variant="contained"
                fullWidth
                type="submit"
                >
                회원가입
              </Button>
            </div>
          </form>
        </div>
      )}
    </Formik>
    </div>
        
  )
}

export default Join