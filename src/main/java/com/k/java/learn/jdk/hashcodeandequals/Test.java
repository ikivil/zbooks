package com.k.java.learn.jdk.hashcodeandequals;

public class Test {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		Person p = new Person();
		Class<Person> c1 = (Class<Person>) p.getClass();
		Class<Person> c2 = null;
		try {
			c2 = (Class<Person>) Class.forName("com.k.java.learn.jdk.hashcodeandequals.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c==c1);
		System.out.println(c1==c2);
		
	}

}
