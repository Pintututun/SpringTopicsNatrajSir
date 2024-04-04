package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
	  Person emp=PersonFactory.getInstance("emp");
	  System.out.println(emp);
	  System.out.println("++++++++++++++++++++++++++++++++");
	  Person st=PersonFactory.getInstance("stud");
	  System.out.println(st);
	  System.out.println("++++++++++++++++++++++++++++++++");
	  Person cus=PersonFactory.getInstance("cust");
	  System.out.println(cus);
	}

}
