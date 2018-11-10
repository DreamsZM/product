package com.zy.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is a message from product2";
    }
}
