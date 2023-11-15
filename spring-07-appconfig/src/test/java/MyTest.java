import com.davis.config.DavisConfig;
import com.davis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(DavisConfig.class);
        User user= context.getBean("getUser", User.class);
        System.out.println(user.getName());

    }
}
