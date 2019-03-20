package com.zdy.springmybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MysqlTest {

    @Test
    public void getTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = applicationContext.getBean("studentService",StudentService.class);
        Student s = studentService.getStudent(1);
        if (s!=null){
            System.out.println(s.getStuName());
        }else{
            System.out.println("cant find stu!");
        }
    }
}
