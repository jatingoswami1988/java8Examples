package com.nucleus;

@FunctionalInterface
interface Sayable {

	default void say() {
		System.out.println("Hello, this is default method");
	}

	static void sayStatic() {
		System.out.println("Hello, this is static method");
	}

	default void say1() {
		System.out.println("Hello, this is default method");
	}

	static void sayStatic2() {
		System.out.println("Hello, this is static method");
	}

	// Abstract method
	void sayMore(String name);
	// void sayMore1(String msg);
	// void sayMore2(String msg);
	// void sayMore3(String msg);
}

public class DefaultMethodExample {

	public static void main(String args[]) {
		Sayable s = (e) -> {
			System.out.println("Hello " + e);
		};
		s.sayMore("Jatin");
		s.say1();
		Sayable.sayStatic();
	}
}
