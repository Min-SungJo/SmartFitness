package com.smartfitness.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartfitness.service.EquipmentService;

@RequestMapping("equipment")
public class EquipmentRestController {

    @Autowired
    EquipmentService equipmentService;

    @PostMapping("/add")
    public void addEm(@RequestBody Map<String, Object> param){
        equipmentService.addEm(param);
    }
}
