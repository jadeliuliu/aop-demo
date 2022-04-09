package com.aop.demo.zhujie;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: liuxuan
 * @date: 2022-04-09 17:34
 **/
@Component
@Aspect
public class AopMethods1 {
    @Before(value="execution(* com.aop.demo.zhujie.UserService1Impl.add(..))")
    public void before(){
        System.out.println("基于注解，before。");
    }

    @After(value="execution(* com.aop.demo.zhujie.UserService1Impl.add(..))")
    public void after(){
        System.out.println("基于注解，after。");
    }
}
