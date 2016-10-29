package com.k.java.learn.jdk.enumk;

public class Test {
	public static void main(String[] args) {
		for(Gender g:Gender.values()){
			System.out.println(g.FEMALE);
		}
		int i = Gender.FEMALE.compareTo(Gender.MALE);
		System.out.println(i);
	}

}
