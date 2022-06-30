package com.nucleus;

import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class OptionalClassExample {

	public static Predicate<Employee> empPredicate = new Predicate<Employee>() {

		@Override
		public boolean test(Employee t) {
			// TODO Auto-generated method stub
			return false;
		}
	};

	public static void main(String[] args) {

		/// a Lambda expression (or function) is just an anonymous function,
		/// i.e., a function with no name and without being bounded to an identifier.

		List<Employee> empList = Employee.getList();
		Optional<List<Employee>> emp = Optional.ofNullable(empList);
		System.out.println(emp.isPresent());
		Predicate<Employee> predicateEmp = e -> e.getName().equals("Jatin") && e.getName().equals("Jatin");

		BiPredicate<Employee, Employee> biPredicate = (e1, e2) -> e1.getName().equals("Twinkle")
				&& e2.getAddress().equals("Goswami");

		Optional<Employee> empObj = empList.stream().filter(e -> e.getName().equals("MSa")).findAny();
		System.out.println(empObj.isPresent());

		// Optional<Employee> empObj1 =
		// empList.stream().filter(e->e.getName().equals("MSa")).findAny();

		Employee e = new Employee(1, "Twinkle", "Goswami");
		System.out.println(biPredicate.test(e, e));
		if (empPredicate.test(e)) {
			System.out.println();
		}

		Predicate<Employee> empNamePredicate = e1 -> e1.getName().equals("Twinkle");
		empNamePredicate.and(e2 -> e2.getAddress().equals("Sachin"));

		Optional<Employee> empObj3 = empList.stream().filter(empNamePredicate).findAny();
		System.out.println(empObj3.isPresent());

		Integer totalQuantity = empList.stream().mapToInt(obj -> obj.getId()).sum();
		System.out.println(totalQuantity);

		/////////////////////////////////////////////////////////////////////
		
		String[] a = new String[10];
		System.out.println(a[1]);

		Optional<String> check = Optional.ofNullable(a[1]);
		if (check.isPresent()) {
			System.out.println("Present");
		} else {
			System.out.println("Absent");
		}

		Optional<Employee> emp1111 = Optional.ofNullable(null);
     	// emp1111.isPresent()

	}

}
