package com.aop.demo.zhujie;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: liuxuan
 * @date: 2022-04-09 17:37
 **/
@Configuration
@ComponentScan(basePackages = {"com.aop.demo.zhujie"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringCfg {
}
