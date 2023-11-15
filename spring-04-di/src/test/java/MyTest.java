import com.davis.pojo.House;
import com.davis.pojo.Student;
import com.davis.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user2 = context.getBean("user2", User.class);
        User user = context.getBean("user2", User.class);

//        House house=context.getBean("house", House.class);
//        System.out.println(user);
//        System.out.println(house);
        System.out.println(user==user2);


    }

    }

