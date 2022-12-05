package com.smartfitness.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EquipmentMapper {

    void addEm(Map<String, Object> param);
    
}
