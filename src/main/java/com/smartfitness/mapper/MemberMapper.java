package com.smartfitness.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.smartfitness.model.Member;

@Mapper
public interface MemberMapper {

    /**회원가입 */
    void join(Member member);
    
}
