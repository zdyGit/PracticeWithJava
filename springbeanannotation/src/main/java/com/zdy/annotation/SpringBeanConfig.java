package com.zdy.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zdy.annotation")
public class SpringBeanConfig {
    @Bean
    public Animal Animal(){
        return new Animal();
    }
}
