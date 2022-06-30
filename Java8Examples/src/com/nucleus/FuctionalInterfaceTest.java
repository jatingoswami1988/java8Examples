package com.nucleus;

@FunctionalInterface
interface Test1 {

	public void say(String name);

	public default void test() {
		System.out.println("Default Method");
	}

	public static void test1() {
		System.out.println("Static Method");
	}
}

public class FuctionalInterfaceTest implements Test1 {

	public static void main(String[] args) {

		Test1 test = s -> {
			System.out.println("Lambda expression " + s);
		};

		test.say("T");
		Test1.test1();

		Test1 fuctionalInterfaceTest = new FuctionalInterfaceTest();
		fuctionalInterfaceTest.test();
	}

	@Override
	public void say(String name) {

	}

}
