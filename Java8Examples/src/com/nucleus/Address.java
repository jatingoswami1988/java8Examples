package com.nucleus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Address implements Comparable<Address> {

	Integer id;
	String addressId;
	String addressName;

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
	@Override
	public int compareTo(Address a) {
		//return this.addressId.compareTo(a.addressId);
		return this.id.compareTo(a.id);
		//return this.id - a.id);
    }
	
	public static void main(String aar[]) {
		
		//Collections.sort();
		Collections.sort(new ArrayList(), new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return 0;
			}
			
		});
		
	}

}
