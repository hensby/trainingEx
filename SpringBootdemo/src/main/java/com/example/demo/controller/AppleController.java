package com.example.demo.controller;

import com.example.demo.entity.Apple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppleController {

    @GetMapping("/apple")
    public Apple getApple() {
        return new Apple("red","a1");
    }
}
