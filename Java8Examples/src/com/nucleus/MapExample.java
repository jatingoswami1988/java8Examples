package com.nucleus;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String arhs[]) {

		List<Employee> empList = Employee.getList();
		//List<Address> addressList = empList.stream().filter(emp->emp.getAddress().equals("")).map(obj -> {
		List<Address> addressList = empList.stream().filter(emp->emp.getAddress().equals("")).map(obj -> {

			Address address = new Address();
			//address.setAddressId(obj.getId());
			// other properties
			address.setAddressName(obj.getAddress());
			return address;

		}).collect(Collectors.toList());
	}
}
