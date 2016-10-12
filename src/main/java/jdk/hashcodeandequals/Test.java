package jdk.hashcodeandequals;

public class Test {
	public static void main(String[] args) {
		Class<jdk.hashcodeandequals.Person> c = jdk.hashcodeandequals.Person.class;
		Person p = new Person();
		Class<jdk.hashcodeandequals.Person> c1 = (Class<Person>) p.getClass();
		Class<jdk.hashcodeandequals.Person> c2 = null;
		try {
			c2 = (Class<Person>) Class.forName("jdk.hashcodeandequals.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c==c1);
		System.out.println(c1==c2);
		
	}

}
