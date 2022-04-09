package com.aop.demo.zhujie;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: liuxuan
 * @date: 2022-04-09 17:34
 **/
@Service
public class UserService1Impl implements UserService1 {
    @Override
    public void add() {
        System.out.println("基于注解添加用户");
    }
}
