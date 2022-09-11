package com.boystark.study.service.impl;

import com.boystark.study.entity.User;
import com.boystark.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boystark.study.service.TestService;
import utils.TestUtils;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User testServiceFunction(long id) {

        TestUtils.testUtil();
        User user = userMapper.findUserById(id);

        /**
         * TODO 业务逻辑
         */
        System.out.println("我是Service中的方法");

        return user;
    }

    @Override
    public List<User> userList() {

        List<User> lists = userMapper.userList(1);
        return lists;
    }
}
