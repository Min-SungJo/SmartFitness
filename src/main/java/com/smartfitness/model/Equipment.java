package com.smartfitness.model;

import lombok.AllArgsConstructor;
import lombok.Data;
/**운동기구 정보 */
@Data
@AllArgsConstructor
public class Equipment {
    /**운동기구 번호 */
    private int em_seq;
    /**운동기구 이름 */
    private String em_name;
    /**운동기구 분류 */
    private String em_type;
    /**운동기구 영상 */
    private String em_video;
    /**신체자극 부위 */
    private String em_part;
    
}
