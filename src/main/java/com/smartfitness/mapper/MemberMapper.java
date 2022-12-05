package com.smartfitness.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.smartfitness.model.Member;

@Mapper
public interface MemberMapper {

    /**회원가입 */
    void join(Member member);

    /**로그인 */
    Map<String,Object> login(Map<String, String> param);

    /**회원정보 수정 */
    void update(Map<String, String> param);

    /**회원 탈퇴 */
    void delete(Map<String, String> param);
    
    
}
