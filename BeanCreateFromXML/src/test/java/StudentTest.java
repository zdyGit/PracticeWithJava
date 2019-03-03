import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void beanTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanXML.xml");
        Student user = (Student)applicationContext.getBean("student");

        System.out.println(user);


    }
}
