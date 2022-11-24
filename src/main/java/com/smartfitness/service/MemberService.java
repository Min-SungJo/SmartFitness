package com.smartfitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartfitness.mapper.MemberMapper;
import com.smartfitness.model.Member;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public void join(Member member) {
        memberMapper.join(member);
    }
    
}
