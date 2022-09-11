package com.boystark.study.web01.controller;

import com.boystark.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boystark.study.service.TestService;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class IndexController {

    @Autowired
    private TestService testService;

    @GetMapping("user/{id}")
    public User index(@PathVariable("id") long id) {
        return testService.testServiceFunction(id);
    }

    @GetMapping("user_list")
    public List<User> lst() {
        return testService.userList();
    }
}
