package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodInjectionTest {
public static void main(String[] args) {
	//Create IOC container
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//Get Target class object reference
	BankService service=ctx.getBean("bankService",BankService.class);
	System.out.println(service.getClass()+" "+service.getClass().getClass());
	
	//Invoke the business method
	double intrAmt=service.calculateIntrestAmount(100000,12,2);
	System.out.println("Intrest Amount is::"+intrAmt);
	
	//Close container
	ctx.close();
}
}
