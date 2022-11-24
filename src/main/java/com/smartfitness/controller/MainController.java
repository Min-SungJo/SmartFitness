package com.smartfitness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("home")
@RestController
public class MainController {
    @GetMapping("/main")
    public String main(){
        return "main";
    }
}
//1차........