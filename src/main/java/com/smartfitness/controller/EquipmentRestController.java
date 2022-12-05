package com.smartfitness.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartfitness.service.EquipmentService;

@RequestMapping("equipment")
public class EquipmentRestController {

    @Autowired
    EquipmentService equipmentService;

    /**운동기구 추가 */
    @PostMapping("/add")
    public void addEm(@RequestBody Map<String, Object> param){
        equipmentService.addEm(param);
    }

    /**운동기구 수정 */
    @PostMapping("/update")
    public void updateEm(@RequestBody Map<String, Object> param){
        equipmentService.updateEm(param);
    }

    /**운동기구 타입확인 */
    @GetMapping("/select")
    public ResponseEntity<?> select(){
        HttpHeaders headers = new HttpHeaders();
        ArrayList<Map<String,Object>> body = equipmentService.select();
        return ResponseEntity.ok()
        .headers(headers)
        .body(body);
    }

}