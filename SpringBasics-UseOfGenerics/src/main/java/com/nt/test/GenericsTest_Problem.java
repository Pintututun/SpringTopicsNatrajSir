package com.nt.test;

public class GenericsTest_Problem {

	public static Person getInstance(String type) {
		if(type.equalsIgnoreCase("emp")) {
			return new Employee();
		}
		else if(type.equalsIgnoreCase("cust")) {
			return new Customer();
		}
		else {
			throw new IllegalArgumentException("Invalid person type");
		}
	}
	public static Object getInstance1(String type) {
		if(type.equalsIgnoreCase("emp")) {
			return new Employee();
		}
		else if(type.equalsIgnoreCase("cust")) {
			return new Customer();
		}
		else if(type.equalsIgnoreCase("stud")) {
			return new Student();
		}
		else {
			throw new IllegalArgumentException("Invalid person type");
		}
	}
	public static void main(String[] args) {
		Employee emp=(Employee)getInstance("emp");
		System.out.println(emp);
		System.out.println("---------------------------");
		Object obj1=getInstance1("emp");
		Employee emp1=(Employee)obj1;
		System.out.println(emp1);
	}
}
