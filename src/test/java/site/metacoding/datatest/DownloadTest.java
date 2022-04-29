package site.metacoding.datatest;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import site.metacoding.datatest.dto.ResponseDto;

public class DownloadTest {

    @Test
    public void 테스트() {

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

            System.out.println("다운 받아지나?" + response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
