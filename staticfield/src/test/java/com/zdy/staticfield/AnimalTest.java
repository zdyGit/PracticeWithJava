package com.zdy.staticfield;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void setStaticFieldTest(){
        System.out.println(Animal.age);
        System.out.println("------------------");
        Animal an1 = new Animal();
        System.out.println(an1.age);
        an1.age = 10 ;
        System.out.println("------------------");
        Animal an2 = new Animal();
        System.out.println(an2.age);
    }
}
