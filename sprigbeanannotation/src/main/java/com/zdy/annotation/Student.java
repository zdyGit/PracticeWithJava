package com.zdy.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("property")
@Lazy(false)
@Component("student")
public class Student {

    @Autowired
    public String name;

    @Autowired
    public int age;

    @PostConstruct
    public void init(){};

    @PreDestroy
    public void destory(){


    }
}
