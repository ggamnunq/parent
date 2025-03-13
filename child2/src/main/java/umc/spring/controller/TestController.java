package umc.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String index() {
        // feat/1 브랜치 적용
        // parent에서 작업
        return "index";
    }

}
