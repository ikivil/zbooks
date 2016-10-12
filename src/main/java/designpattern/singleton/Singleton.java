package designpattern.singleton;

/**
 * 饿汉式
 * @author K
 *
 *//*
public final class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}*/

/**
 * 懒汉式
 * @author K
 *
 *//*
public final class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    
    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}*/


/**
 * 懒汉式 - 双检锁方式
 * @author K
 *
 */
public class Singleton{  
	  private static Singleton instance;    //声明静态的单例对象的变量  
	  private Singleton(){}    //私有构造方法   

	  public static Singleton getSingle(){    //外部通过此方法可以获取对象    
	    if(instance == null){     
	        synchronized (Singleton.class) {   //保证了同一时间只能只能有一个对象访问此同步块        
	            if(instance == null){      
	            	instance = new Singleton();          
	        }     
	      }  
	    }    
	    return instance;   //返回创建好的对象   
	  }  
	} 