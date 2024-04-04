package com.nt.test;

import com.nt.commons.Customer;
import com.nt.commons.Employee;
import com.nt.commons.Person;

public class GenericsTest_Problem {

	public static Person getInstance(String type) {
		if(type.equalsIgnoreCase("emp")) {
			return new Employee();
		}
		else if(type.equalsIgnoreCase("cust")) {
			return new Customer();
		}
		else
		{
			throw new IllegalArgumentException("Invalid Person Type");
		}
	}
}
