package com.siriuscom.springboot.FirstMacSpringBoot.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstMacRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach Name : "+coachName+" team under him : "+teamName;
    }


    @GetMapping("/")
    public String greet(){
        return "Dear all, Hello World and everyone i am writing my mind, have a nice evening!!!";
    }

    //creating new end point to check the dev-tools in action.

    @GetMapping("/meditation")
    public String meditate(){
        System.out.println("Do deep breathing for 5 minutes!!!");
        return "Do deep breathing for 5 minutes!!!";
    }


    @GetMapping("/cardio")
    public String heart(){
        System.out.println("run hard 2k");
        return "run hard 2k";
    }



}
