package com.around.hurb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class DeleteController {

    // http://localhost:8080/api/v1/get-api/variable1/{String 값} - 특정 ID값을 넣고 이걸 기반으로 DB조회 후 삭제
    @DeleteMapping(value = "/delete/{variable}") 
    public String DeleteVariable(@PathVariable String variable) {
        return variable;
    }

}
