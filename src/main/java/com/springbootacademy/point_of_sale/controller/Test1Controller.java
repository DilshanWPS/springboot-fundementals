package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/test1")

public class Test1Controller{

    @GetMapping(path="/pvoid")
    public void getMyText1(){
        String text="command line output-welcome to the spring boot with terminal output";
        System.out.println();
        System.out.println(text);
    }


    @GetMapping(path="/ptext")
    public String getMyText2(){
        String text="server side output-welcome to the spring boot with server output";
        return text;
    }

}
