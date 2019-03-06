package com.zdy.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Animal {
    @Value("cat")
    public String name;
}
