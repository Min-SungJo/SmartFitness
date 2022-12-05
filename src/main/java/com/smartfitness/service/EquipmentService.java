package com.smartfitness.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartfitness.mapper.EquipmentMapper;

@Service
public class EquipmentService {

    @Autowired
    EquipmentMapper equipmentMapper;
    public void addEm(Map<String, Object> param) {
        equipmentMapper.addEm(param);
    }
    
}
