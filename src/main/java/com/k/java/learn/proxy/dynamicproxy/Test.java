package com.k.java.learn.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * JDK 动态代理测试
 * @author KK
 *
 */
public class Test {
	public static void main(String[] args) {
		CustomInvocationHandler handler = new CustomInvocationHandler(new PersonImpl()); 
		
		Person proxy = (Person) Proxy.newProxyInstance(  
                Test.class.getClassLoader(),  
                new Class[]{Person.class},  
                handler);
		
		//proxy.say();
		proxy.say("hello");
		proxy.eat();
		proxy.eatWhat("mian bao");
	}

}
