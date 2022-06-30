  /* Lamdba Expression is first Step to Functional Programming.
 * LE can be expressed as a instance of Functional Interface(Interface with only one abstract method. example java.lang.Runnable
 * LE are functions which can be created without belonging to any class.
 * LE can be passed around as if it was an object and can be executed on demand.
 * 
 * 
 * 
 * 
 * */

package com.nucleus;

@FunctionalInterface
interface Square {
	int calculate(int x);
	
	/// N no of default methods.
	
	default double areaOfCircle(int radius){
		return 3.14*radius;
	}
	
}

public class LambdaExpressions {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
		s.areaOfCircle(20);
	}
}
