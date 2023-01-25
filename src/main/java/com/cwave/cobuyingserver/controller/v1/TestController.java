package com.cwave.cobuyingserver.controller.v1;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/react") //리액트와 연결 확인
    public List<String> Hello(){
        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");
    }

    @RequestMapping(value="/auth", method = {RequestMethod.POST})
    public List<String> auth(@RequestBody String data){
        System.out.println(data);
        return Arrays.asList("인증 성공");
    }

    @RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
    public List<String> auth2(@RequestBody String data){
        System.out.println(data);
        return Arrays.asList("인증 성공");
    }
}
