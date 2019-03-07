package com.zdy.autoproxy;

public class AspectObj implements IAspectFunc {

    public AspectObj(){}

    public void before(){
        System.out.println("开始之前");
    }

    public void after(){
        System.out.println("已完成");
    }
}
