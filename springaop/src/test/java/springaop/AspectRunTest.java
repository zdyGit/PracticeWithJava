package springaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectRunTest {

    @Test
    public void run(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ActionTest action = (ActionTest) applicationContext.getBean("actionTest");
        action.doWork();
    }
}
