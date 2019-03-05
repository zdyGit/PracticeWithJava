package com.zdy.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Person {
    @Autowired
    public Animal animal;
}
