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
