package com.zdy.autoproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AspectHandler implements InvocationHandler {

    private IAspectFunc aspectObj;
    private ISayHello targe;
    public AspectHandler(ISayHello targe, IAspectFunc aspectObj){
        this.targe = targe;
        this.aspectObj = aspectObj;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        Class aspectObjClass = this.aspectObj.getClass();

        Method before = aspectObjClass.getDeclaredMethod("before");
        before.invoke(this.aspectObj);

        method.invoke(this.targe,args);

        Method after = aspectObjClass.getDeclaredMethod("after");
        after.invoke(this.aspectObj);

        return result;
    }
}
