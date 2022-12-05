package com.smartfitness.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartfitness.mapper.EquipmentMapper;

@Service
public class EquipmentService {

    @Autowired
    EquipmentMapper equipmentMapper;

    /**운동기구 추가 */
    public void addEm(Map<String, Object> param) {
        equipmentMapper.addEm(param);
    }

    /**운동기구 수정 */
    public void updateEm(Map<String, Object> param) {
        equipmentMapper.updateEm(param);
    }
    
}
