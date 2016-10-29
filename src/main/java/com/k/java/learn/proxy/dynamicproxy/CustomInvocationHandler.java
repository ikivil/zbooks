package com.k.java.learn.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * JDK 实现
 * @author KK
 *
 */
public class CustomInvocationHandler implements InvocationHandler {  
    private Object target;  
  
    public CustomInvocationHandler(Object target) {  
        this.target = target;  
    }  
  
    @Override  
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {  
        System.out.println("Before invocation");  
        Object retVal = method.invoke(target, args);  
        System.out.println("After invocation");  
        return retVal;  
    }  
}  