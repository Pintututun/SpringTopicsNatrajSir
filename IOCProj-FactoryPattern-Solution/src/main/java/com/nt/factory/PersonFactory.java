package com.nt.factory;

import com.nt.comp.*;
public class PersonFactory {

	public static Person getInstance(String personType) {
		Person per=null;
		if(personType.equalsIgnoreCase("emp")) {
			AadharDetails details=new AadharDetails(654, 40, 543553453L);
			per=new Employee("raja","hyd",details,"CLERK",1001);
		}
		else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details1=new AadharDetails(654,42,352);
			per=new Customer("Suresh","Vizag",details1,123,356);
		}
		else if(personType.equalsIgnoreCase("stud")) {
			AadharDetails details2=new AadharDetails(789,35,989);
			per=new Student("Rakesh","Vizag1",details2,"JAVA",345);
			
		}
		else {
			throw new IllegalArgumentException("Invalid Person Type");
			
		}
		return per;
	}
}
