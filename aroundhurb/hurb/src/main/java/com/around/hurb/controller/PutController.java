package com.around.hurb.controller;

import com.around.hurb.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    // http://localhost:8080/api/v1/put-api/default
    @PutMapping(value = "/default")
    public String putMethod() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/put-api/member
    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

    /*
    param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
     */

        return sb.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2 - 서버에서 오버라이딩한 toStirng한 형태로 return
    @PutMapping(value = "/member1")
    public String postMemberDto1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2 - json 형태로 return
    @PutMapping(value = "/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    // http://localhost:8080/api/v1/put-api/member2 - responsebody값은 그대로 들어오지만 , 응답 code가 다름
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }

}
