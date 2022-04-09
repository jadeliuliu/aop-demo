import com.aop.demo.peizhi.UserService;
import com.aop.demo.peizhi.UserServiceImpl;
import com.aop.demo.zhujie.SpringCfg;
import com.aop.demo.zhujie.UserService1;
import com.aop.demo.zhujie.UserService1Impl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liuxuan
 * @date: 2022-04-09 17:39
 **/

public class AopTest1 {
    @Test
    public void testUserServiceAop() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);  //加载配置类
        // proxy-target-class="false" 时，使用jdk代理
        // 强制转换必须用父类接口来定义
        //UserService1 userService1 = (UserService1) context.getBean(UserService1.class);
        UserService1Impl userService1 = (UserService1Impl)context.getBean("userService1Impl");
        userService1.add();
    }
}
