import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void beanTest(){

        ApplicationContext appContext = new ClassPathXmlApplicationContext("beanConfiguration.xml");
        Person p = (Person)appContext.getBean("person");

        Person1 p1 = (Person1)appContext.getBean("person1");


    }
}
