
package com.nucleus;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Testing {

	public void say();

	public default void defaultMethod() {
		System.out.println("Default Method");
	}

	public static void staticMethod() {
		System.out.println("Statuc Method");
	}

}

public class FunctionalInterfaceExample {
	public static void main(String args[]) {

		Testing t = () -> {
			System.out.println("Hello");
		};

		t.say();
		t.defaultMethod();
		Testing.staticMethod();

		// create a list of strings
		List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

		// declare the predicate type as string and use
		// lambda expression to create object

		Predicate<String> p = (s) -> s.startsWith("G") || s.startsWith("G");
		Predicate<String> p1 = (s) -> s.endsWith("2");

		Predicate<String> andTest = p.and(p1);
		List<String> finalResut = names.stream().filter(p).collect(Collectors.toList());

		// Iterate through the list
		for (String st : names) {
			// call the test method
			if (p.test(st))
				System.out.println(st);
		}

		BinaryOperator<Integer> binaryOperator = (s1, s2) -> s1 * s2;
		binaryOperator.apply(10, 20);

		List<Employee> empList = Employee.getList();
		Predicate<Employee> result = (emp) -> emp.getName().equals("Jatin");
		List<Employee> filteredList = empList.stream().filter(result).collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
