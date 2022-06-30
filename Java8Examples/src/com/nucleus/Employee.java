package com.nucleus;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	private Integer id;

	private String name;

	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static List<Employee> getList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Brishketu", "Delhi"));
		empList.add(new Employee(2, "Nitin", "Rajasthan"));
		empList.add(new Employee(3, "Manish", "Punjab"));
		empList.add(new Employee(4, "Brishketu", "Haryana"));
		return empList;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +"-"+this.name+"-"+this.address;
	}

}
