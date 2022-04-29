package site.metacoding.datatest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDto {
    private ResponseDto responseDto;
    private Integer currentCount;
    private List<DataDto> data;
}
