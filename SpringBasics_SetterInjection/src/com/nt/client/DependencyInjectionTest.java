package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
public static void main(String[] args) {
	//Create IOC container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	//Get Target Spring Bean Class Object from IOC container
	Object obj=ctx.getBean("wmg");
	//Using super class reference we can not call direct methods of sub class so we need to go for type casting
	WishMessageGenerator generator=(WishMessageGenerator)obj;
	
	//Invoke the Business method
	String result=generator.generateWishMessage("Raja");
	System.out.println("Result:"+result);
	
	//Close the IOC container
	ctx.close();
}
}
