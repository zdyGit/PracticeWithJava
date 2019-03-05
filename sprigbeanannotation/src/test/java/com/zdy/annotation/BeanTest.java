package com.zdy.annotation;

import com.zdy.annotation.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void beanCreateTest(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = appContext.getBean("student",Student.class);
        System.out.println(stu.getStuName());

        Teacher tech = appContext.getBean("teacher",Teacher.class);
        System.out.println(tech.getTechName());

        ClassRoom classRoom = appContext.getBean("classRoom",ClassRoom.class);
        System.out.println(classRoom.getRoomName());

        ClassRoom classRoom1 = appContext.getBean("classRoom",ClassRoom.class);
        System.out.println(classRoom.getRoomName());

        System.out.println(classRoom.equals(classRoom1));
    }
}
