package com.zdy.autoproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void greetTest(){
        ISayHello sayHello = new SayHello();
        AspectHandler handler = new AspectHandler(new SayHello(),new AspectObj());
        ISayHello proxyInstance = (ISayHello) Proxy.newProxyInstance(sayHello.getClass().getClassLoader(),sayHello.getClass().getInterfaces(),handler);
        proxyInstance.say("11");
    }
}

