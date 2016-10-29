package com.k.java.learn.proxy.dynamicproxy;

public class PersonImpl implements Person {

	@Override
	public void say() {
		System.out.println("say...");

	}

	@Override
	public void say(String name) {
		System.out.println("say...:"+name);

	}

	@Override
	public void eat() {
		System.out.println("eat...:");

	}

	@Override
	public void eatWhat(String food) {
		System.out.println("eat...:"+food);

	}

}
