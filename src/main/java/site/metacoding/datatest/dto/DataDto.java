package site.metacoding.datatest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataDto {
    private String 경도도;
    private String 관광지아이디;
    private String 관광지명;
    private String 실내구분;
    private String 위도도;
    private String 이동시간;
    private String 지역아이디;
    private String 코스아이디;
    private String 코스순서;
    private String 테마명;
    private String 테마분류;
}
