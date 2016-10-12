package jdk.hashcodeandequals;

/**
 * hashCode 与 equals 方法
 * @author k
 *
 */
public class Person {
	private long id;
	private int age;
	private String name;
	public Person() {
		super();
	}
	public Person(long id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 不重写equals默认调用 == 物理地址判断
	 * 重写则按照自己的逻辑判断
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	/**
	 * A.equals B 则 A.hashCode=B.hashCode,反之则不一定，可能hash碰撞
	 * 
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
