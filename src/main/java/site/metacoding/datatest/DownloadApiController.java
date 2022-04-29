package site.metacoding.datatest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.datatest.domain.Travle;
import site.metacoding.datatest.domain.TravleRepository;

@RequiredArgsConstructor
@RestController
public class DownloadApiController {

    private final DownloadService downloadService;
    private final TravleRepository travleRepository;

    @GetMapping("/")
    public ResponseDto<?> download() {

        List<Travle> travleEntity = downloadService.다운로드();
        return new ResponseDto<>(1, "성공", travleEntity);
    }

    @GetMapping("/travle/show")
    public ResponseDto<?> main() {

        List<Travle> travleEntity = travleRepository.findAll();
        System.out.println(travleEntity);

        return new ResponseDto<>(1, "성공", travleEntity);
    }
}
