package com.boystark.study.service;

import com.boystark.study.entity.User;

import java.util.List;

public interface TestService {
    public User testServiceFunction(long id);

    public List<User> userList();
}
