package com.qiushi.spring.demo;

import com.qiushi.spring.ioc.beans.factory.annotation.Component;

/**
 * 用于测试的service服务
 */
@Component(value = "testService")
public class TestService {
    public void say(String str) {
        System.out.println(str);
    }
}
