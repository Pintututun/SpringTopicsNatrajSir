package com.nt.factory;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {
   
	public static Person getInstance(String personType) {
		Person per=null;
		if(personType.equalsIgnoreCase("emp")) {
         AadharDetails details=new AadharDetails(654646L,40,543553453L);
         per=new Employee("Raja","Hyd",details,"Clerk",15000.0);
	}
		else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details1=new AadharDetails(654646465L,42,35153453L);
			per=new Customer("Suresh","Vizag",details1,12345,5465465.0);
		}
		else if(personType.equalsIgnoreCase("stud")) {
			AadharDetails details2=new AadharDetails(6546451L,35,35653453L);
			per=new Student("Rakesh","Odisha",details2,"Java",2345);
			
		}
		else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return per;
}
}