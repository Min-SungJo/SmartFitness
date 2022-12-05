package com.smartfitness.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EquipmentMapper {

    /**운동기구 추가 */
    void addEm(Map<String, Object> param);

    /**운동기구 수정 */
    void updateEm(Map<String, Object> param);

    /**운동기구 타입확인 */
    Map<String, Object> selectAll();
    Map<String, Object> selectF();
    Map<String, Object> selectM();
    Map<String, Object> selectC();
    
}
