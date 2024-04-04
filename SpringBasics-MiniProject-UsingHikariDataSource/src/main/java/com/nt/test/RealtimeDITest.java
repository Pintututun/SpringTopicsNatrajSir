package com.nt.test;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerOperationsController;
import com.nt.model.Customer;

public class RealtimeDITest {

	public static void main(String[] args) {
		//Read input values from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name=sc.next();
		System.out.println("Enter customer address:");
		String addrs=sc.next();
		System.out.println("Enter Customer Bill Amount:");
		double billAmt=sc.nextDouble();
		System.out.println("Enter discount percentage:");
		double discount=sc.nextDouble();
		
		//Create Customer class object
		Customer cust=new Customer();
		cust.setCname(name);
		cust.setCaddr(addrs);
		cust.setBillAmount(billAmt);
		cust.setDiscount(discount);
		
		//Create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Get Controller class object from the IOC container(Dependency lookup)
		CustomerOperationsController controller=ctx.getBean("custController",CustomerOperationsController.class);
         
		//Invoke the business method
		try {
			String resultMsg=controller.processCustomer(cust);
			System.out.println(resultMsg);
		}
		catch(SQLException se)
		{
			if(se.getErrorCode()==12899)
			{
				System.out.println("Problem with column size");
			}
			else {
				System.out.println("One or other DB problem");
			}
		}
		catch(Exception e)
		{
			System.out.println("Internal Problem---Try again::"+e.getMessage());
			
		}
	}

}
