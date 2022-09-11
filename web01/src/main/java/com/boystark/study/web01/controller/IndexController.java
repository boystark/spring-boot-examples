package com.boystark.study.web01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boystark.study.service.TestService;

@RestController
@RequestMapping(path = "web01")
public class IndexController {

    @Autowired
    private TestService testService;

    @GetMapping("index")
    public String index() {
        System.out.println("this is web01");
        testService.testServiceFunction();
        return "this is web01";
    }
}
