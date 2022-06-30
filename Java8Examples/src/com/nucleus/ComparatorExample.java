package com.nucleus;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static Comparator<Employee> name = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId().compareTo(o2.getId());
		}
		
	};

	public static void main(String args[]) {

		List<Employee> employees = Employee.getList();
		
		employees.sort(Comparator.comparing(e -> e.getName()));
		employees.sort(Comparator.comparing(Employee::getName)); //Method References Also.
		employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getName));

		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName())); // Lambda expression

		Comparator<Employee> comparator = Comparator.comparing(e -> e.getName());// FunctionalInterface
		employees.sort(comparator.reversed());

		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAddress);
		employees.sort(groupByComparator);
		// System.out.println(employees);

		/// Parallel Sort >

		Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
		Arrays.parallelSort(employeesArray, Comparator.comparing(Employee::getName));

	}

}
