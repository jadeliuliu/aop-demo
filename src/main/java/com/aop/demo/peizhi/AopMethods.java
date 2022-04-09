package com.aop.demo.peizhi;

import org.springframework.stereotype.Component;

/**
 * @author: liuxuan
 * @date: 2022-04-09 12:51
 **/
@Component
public class AopMethods {

    public void before(){
        System.out.println("方法前执行before。");
    }

    public void after(){
        System.out.println("方法后执行after。");
    }
}
