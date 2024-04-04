package com.nt.test;

import com.nt.comp.AadharDetails;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {
public static void main(String[] args) {
	AadharDetails details=new AadharDetails(12345L,20,999999L);
	Person emp=new Employee("Raja","Hyd",details,"HCL",67877.0);
	System.out.println(emp);
	
	System.out.println("==================================");
	AadharDetails details1=new AadharDetails(12311L, 20,91949L);
	Person stud=new Student("Ramesh","Vizag",details1,"Java",1122);
	System.out.println(stud);
	
}
}
