package com.k.java.learn.jdk.abstractandinterface;

public class Student extends AbstractPerson {

	@Override
	public void id() {
		System.out.println("Student类 id()");

	}@Override
	protected void say() {
		System.out.println("Student类 say()");
	}

}
