package com.accenture.HelloSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Spring")
public class HelloSpringController {
    @GetMapping("/api")
    public String hello(){
        return "Hi Spring Boot world! port 8083";
    }
}
