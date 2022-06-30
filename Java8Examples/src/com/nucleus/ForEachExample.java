package com.nucleus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {

		// Represents an operation that accepts a single input argument and
		// returns no
		// result. Unlike most other functional interfaces, {@code Consumer} is
		// expected
		// to operate via side-effects.

		Consumer<Integer> action = System.out::println;

		Employee empObj = new Employee();
		String name = "Jatin";

		// Perform operation on given argument.
		Consumer<Employee> emp = e -> {
			e.setAddress(name);
			e.setId(100);
			e.setName("Manish");
		};

		// emp.
		emp.accept(empObj);

		System.out.println(empObj);

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		numberList.stream().filter(n -> n % 2 == 0).forEach(action);

		Function<Integer, Integer> funct = obj -> {
			return obj * 5;

		};
		
		Integer result = funct.apply(6);

		BiFunction<Integer, Integer, Integer> function = (x, y) -> {
			return x * y;

		};
		// function.andThen(after)
		//Integer result = function.apply(5, 10);
		//System.out.println(result);

		List<Employee> emp10 = Employee.getList();
		emp10.forEach(obj -> {

			// obj.getAddress()

		});

		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("1", new Employee());
		map.put("2", new Employee());
		map.put("3", new Employee());
		map.put("4", new Employee());
		
		map.forEach((key,value)->{
			List<Employee> emp111 = Employee.getList();
		});
		
		List<Integer> lsit = Arrays.asList(1,2,3,4,5,6,4,4,4);
		lsit.stream().distinct().collect(Collectors.toList());
		
	}

}
