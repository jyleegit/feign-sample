package com.example.feigntest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	// 1. 작성한 서비스를 가져오고
    private final TestService testService;

    // 2. 서비스를 사용하기 위한 생성자를 만들어줍니다.
    public TestController(TestService testService) {
        this.testService = testService;
    }

    // 1) 메인 페이지로 접근
    // 2) Feign Client가 /testfeign 으로 get 호출
    // 3) 반환값 받고 메인에서 보여줍니다.
    @GetMapping("/")
    public String main() {
        return testService.testFeign();
    }

    // Feign Client 요청에 응답을 주기 위한 컨트롤러
    @GetMapping("/testfeign")
    public String testFeign() {
        return "Hello Feign Cleint~ 찡긋";
    }
}
