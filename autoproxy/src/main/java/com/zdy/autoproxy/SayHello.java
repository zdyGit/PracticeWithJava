package com.zdy.autoproxy;

public class SayHello implements ISayHello {
    public void say(String name){
        if ((name == null ) || name.trim().length() == 0 )
            return ;
        System.out.println(String.format("hello , %s !",name));
    }

    @Override
    public void say() {
        System.out.println(String.format("hello world !"));
    }
}
