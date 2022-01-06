package com.springcloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ServiceController {
    @RequestMapping("/get")
    public  String get(){
        return "ceshi";
    }
}
