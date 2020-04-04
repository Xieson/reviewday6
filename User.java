package Day_6;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
}