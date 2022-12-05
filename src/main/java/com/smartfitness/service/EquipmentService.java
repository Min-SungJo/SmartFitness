package com.smartfitness.service;

import java.util.ArrayList;
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

    /**운동기구 타입확인 */
    public ArrayList<Map<String, Object>> select() {
        ArrayList<Map<String, Object>> result = new ArrayList<>();
        //전체
        result.add(equipmentMapper.selectAll());
        //프리웨이트
        result.add(equipmentMapper.selectF());
        //머신
        result.add(equipmentMapper.selectM());
        //카디오
        result.add(equipmentMapper.selectC());
        return result;
        
    }
    
}
