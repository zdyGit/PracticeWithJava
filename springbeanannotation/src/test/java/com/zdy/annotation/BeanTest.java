package com.zdy.annotation;

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

        for(int i=0;i<tech.getStudentList().size();i++){
            Student s = tech.getStudentList().get(i);
            System.out.println(s.getStuName());
        }
        System.out.println("---------注解配置----------");
        Person p1 = appContext.getBean("person",Person.class);
        System.out.println(p1.animal.name);
    }
}
