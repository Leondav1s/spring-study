import com.davis.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext contex = new  ClassPathXmlApplicationContext ("applicationContext.xml");

        //动态代理 代理的是接口
        UserService userService = contex.getBean("userService", UserService.class);
        userService.select();

    }
}
