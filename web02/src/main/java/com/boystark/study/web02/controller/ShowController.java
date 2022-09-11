package com.boystark.study.web02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "web02")
public class ShowController {

    @GetMapping("index")
    public String index() {
        System.out.println("this is web02");
        return "this is web02";
    }
}
