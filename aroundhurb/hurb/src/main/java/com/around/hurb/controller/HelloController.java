package com.around.hurb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @RequestMapping(value = "/hello") - method 없이 설정 : 어떠한 method로 보내도 같은 응답
    // @RequestMapping(value="/hello, method = RequestMethod.GET) - 고전방식
    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
