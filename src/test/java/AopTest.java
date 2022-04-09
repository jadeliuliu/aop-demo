import com.aop.demo.peizhi.UserService;
import com.aop.demo.peizhi.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: liuxuan
 * @date: 2022-04-09 14:59
 **/
public class AopTest {
    @Test
    public void testUserServiceAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        // proxy-target-class="false" 时，使用jdk代理
        // 强制转换必须用父类接口来定义
        UserService userService = (UserService)context.getBean(UserServiceImpl.class);
        //UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");
        userService.addUser();
    }
}
