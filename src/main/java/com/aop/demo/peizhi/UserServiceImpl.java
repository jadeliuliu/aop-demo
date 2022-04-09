package com.aop.demo.peizhi;

import org.springframework.stereotype.Service;

/**
 * @author: liuxuan
 * @date: 2022-04-09 12:45
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("添加一名用户");
    }
}
