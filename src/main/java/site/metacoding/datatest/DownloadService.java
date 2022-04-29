package site.metacoding.datatest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import site.metacoding.datatest.domain.Travle;
import site.metacoding.datatest.domain.TravleRepository;
import site.metacoding.datatest.dto.DataDto;
import site.metacoding.datatest.dto.ResponseDto;

@RequiredArgsConstructor
@Service
public class DownloadService {

    private final TravleRepository travleRepository;
    
    public List<Travle> 다운로드() {

        List<Travle> travles = new ArrayList<>();
        List<Travle> travleEntity = new ArrayList<>();
        
        String key = "eCazEq%2FCP4iBdrQDcQQrLr3rgUrV%2ByZOFRdwxGTrcfeZbe3FqDvkQ6iMAWgeXRDOa%2FABNLYI3Dhz7hzxyUuI4A%3D%3D";
        
        StringBuffer sb = new StringBuffer();
        sb.append("http://api.odcloud.kr/api/15007097/v1/uddi:e1cdb81d-44d4-40c1-a8d8-f1b311129a54?");
        sb.append("page=1&");
        sb.append("perPage=10&");
        sb.append("serviceKey=");
        sb.append(key);

        try {
            URI uri = new URI(sb.toString());
            RestTemplate rt = new RestTemplate();

            ResponseDto response = rt.getForObject(uri, ResponseDto.class);

            List<DataDto> dataDtos = response.getData();

            for(int i = 0; i < dataDtos.size(); i++) {
                Travle toTravle = Travle.builder()
                .경도도(dataDtos.get(i).get경도도())
                .관광지명(dataDtos.get(i).get관광지명())
                .관광지아이디(dataDtos.get(i).get관광지아이디())
                .실내구분(dataDtos.get(i).get실내구분())
                .위도도(dataDtos.get(i).get위도도())
                .이동시간(dataDtos.get(i).get이동시간())
                .지역아이디(dataDtos.get(i).get지역아이디())
                .코스순서(dataDtos.get(i).get코스순서())
                .코스아이디(dataDtos.get(i).get코스아이디())
                .테마명(dataDtos.get(i).get테마명())
                .테마분류(dataDtos.get(i).get테마분류())
                .build();

                travles.add(toTravle);

                travleEntity = travleRepository.saveAllAndFlush(travles);

                System.out.println("받은 엔티티 ====" + travleEntity.size());
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
        
        return null;
    }

    // public List<Travle> 전체() {
    //     List<Travle> travleEntity = travleRepository.findAll();
    //     return travleEntity;
    // }
}
