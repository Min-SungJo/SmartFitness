package com.smartfitness.model;

import lombok.Data;

@Data
public class Member {
    private String mem_id;
    private String mem_pw;
    private String mem_name;
    private String mem_grade;
    private String mem_email;
    private String mem_phone;
    private String mem_addr;
    private String mem_birthday;
    private String mem_token;
}
