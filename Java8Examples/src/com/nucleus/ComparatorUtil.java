package com.nucleus;

import java.util.Comparator;

public class ComparatorUtil {

	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getName().compareTo(emp2.getName());
		}

	};
	
/*	public static Comparable<Employee> nameComparator1 = new Comparable<Employee>() {

		@Override
		public int compareTo(Employee o) {

			return this.compareTo(o.)
		}

		

	};*/

}
