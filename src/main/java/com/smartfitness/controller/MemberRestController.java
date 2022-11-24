package com.smartfitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/join")
    public void join(@RequestBody Member member){
        memberService.join(member);
    }
}
