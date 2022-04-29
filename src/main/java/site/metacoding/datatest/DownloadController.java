package site.metacoding.datatest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class DownloadController {
    
    @GetMapping("/travle")
    public String main() {

        return "main";
    }
}
