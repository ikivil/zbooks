package com.k.java.learn.proxy.staticproxy;

/**
 * 静态代理
 * 手动实现原理，会生成代理类字节码
 * @author KK
 *
 */
public class SimpleProxy implements Person {

	@Override
	public void say() {
		System.out.println("Before invocation");  
		System.out.println("say...");
		System.out.println("Before invocation");  

	}

	@Override
	public void say(String name) {
		System.out.println("Before invocation");  
		System.out.println("say...:"+name);
		System.out.println("Before invocation");  

	}

	@Override
	public void eat() {
		System.out.println("Before invocation");  
		System.out.println("eat...:");
		System.out.println("Before invocation");  

	}

	@Override
	public void eatWhat(String food) {
		System.out.println("Before invocation");  
		System.out.println("eat...:"+food);
		System.out.println("Before invocation");  
	}

}
