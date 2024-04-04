package com.nt.test;

import com.nt.comp.*;

public class FactoryPatternProblemTest {
public static void main(String[] args) {
	//Create AadharDetails class obj
	AadharDetails details=new AadharDetails(123, 20,99999L);
	Person emp=new Employee("raja","hyd",details,"HCL",67877.0);
	System.out.println(emp);
	
	
	System.out.println("====================================");
	AadharDetails details1=new AadharDetails(121,20,91949L);
	Person stud=new Student("ramesh","vizag",details1,"java",11);
	System.out.println(stud);
	
}
}
