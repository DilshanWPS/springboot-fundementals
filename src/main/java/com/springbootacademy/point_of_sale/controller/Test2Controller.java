package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/test2")

public class Test2Controller{

    @GetMapping("/pcmd")
    public void getTerminalSum(){
        int x=10;
        int y=20;
        int total=x+y;
        System.out.println(total);
    }

    @GetMapping("/pserver")
    public int getSum(){
        int x=10;
        int y=20;
        int total=x+y;
        return total;
    }


}