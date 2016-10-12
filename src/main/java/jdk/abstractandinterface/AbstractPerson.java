package jdk.abstractandinterface;

/**
 * 抽象类
 * 可以包含 抽象方法、普通方法
 * @author k
 *
 */
public abstract class AbstractPerson {
	
	/**
	 * 抽象方法
	 */
	public abstract void id();
	
	/**
	 * 普通方法
	 */
	protected void say(){
		System.out.println("AbstractPerson类 say方法");
		
	}
	

}
