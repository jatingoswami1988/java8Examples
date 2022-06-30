/*Method reference is used to refer method of functional interface
 * Reference to a static method.
   Reference to an instance method.
   Reference to a constructor.
 * 
 * 
 * 
 * 
 * */


package com.nucleus;

import java.util.function.Consumer;

public class MethodReferences {

	public static Consumer<Employee> emp = e -> {
		e.setAddress("jatin");
		e.setId(100);
		e.setName("Manish");
	};
	
	public static void main(String[] args) {
		
		
		

	}

}
