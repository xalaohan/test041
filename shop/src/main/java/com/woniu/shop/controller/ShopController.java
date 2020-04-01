package com.woniu.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @GetMapping("/say")
    public String say(){
        return "hello";
    }
}
