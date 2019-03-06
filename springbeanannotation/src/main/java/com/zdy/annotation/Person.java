package com.zdy.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("person")
public class Person {
    @Autowired
    public Animal animal;

    @PostConstruct
    public void init(){
        System.out.println("Person init");
    }

    @PreDestroy
    public void destory(){

    }
}
