package com.smartfitness.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartfitness.model.Member;
import com.smartfitness.service.MemberService;

@RequestMapping("member")
@RestController
public class MemberRestController {
    
    @Autowired
    MemberService memberService;

    /**회원가입 */
    @PostMapping("/join")
    public void join(@RequestBody Member member){
        memberService.join(member);
    }

    /**로그인 */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> param){
        HttpHeaders headers = new HttpHeaders();
        Map<String, Object> body = memberService.login(param);

        return ResponseEntity.ok()
        .headers(headers)
        .body(body);
    }

    /**회원정보 수정 */
    @PostMapping("/update")
    public void update(@RequestBody Map <String, String> param){
        memberService.update(param);
    }

    /**회원탈퇴 */
    @PostMapping("/delete")
    public void delete(@RequestBody Map <String,String> param){
        memberService.delete(param);
    }

}
