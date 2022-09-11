package com.boystark.study.service.impl;

import com.boystark.study.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boystark.study.service.TestService;
import utils.TestUtils;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void testServiceFunction() {

        TestUtils.testUtil();

        testDao.testDaoFunction();
        /**
         * TODO 业务逻辑
         */
        System.out.println("我是Service中的方法");

    }
}
