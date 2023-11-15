import com.davis.dao.UserDaoImpl;
import com.davis.dao.UserDaosqlImpl;
import com.davis.service.UserService;
import com.davis.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class MyTest {
//    public static void main(String[] args) {
//        UserService userService=new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaosqlImpl());
//        userService.getUser();
//    }
//}

public  class MyTest{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService=(UserServiceImpl) context.getBean("userserviceImpl");
        userService.getUser();

    }
}