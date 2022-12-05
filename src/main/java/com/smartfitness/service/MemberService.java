package com.smartfitness.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartfitness.mapper.MemberMapper;
import com.smartfitness.model.Member;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    /**회원가입 */
    public void join(Member member) {
        memberMapper.join(member);
    }

    /**로그인 */
    public Map<String,Object> login(Map<String, String> param) {
        return memberMapper.login(param); 
    }

    /**회원정보 수정 */
    public void update(Map<String, String> param) {
        memberMapper.update(param);
    }

    /**회원탈퇴 */
    public void delete(Map<String, String> param) {
        memberMapper.delete(param);
    }
    
}
