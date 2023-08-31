package com.prakat.projectx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")
public class UserController {
    @GetMapping("hello")
    public String helloWorld(){
        return "Hello world";
    }
}
