package com.siriuscom.springboot.FirstMacSpringBoot.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstMacRestController {

    @GetMapping("/")
    public String greet(){
        return "Hello World and everyone, have a nice evening!!!";
    }
}
