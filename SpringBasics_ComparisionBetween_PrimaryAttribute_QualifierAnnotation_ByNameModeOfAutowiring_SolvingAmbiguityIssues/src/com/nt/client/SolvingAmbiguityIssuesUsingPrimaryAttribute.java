package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SolvingAmbiguityIssuesUsingPrimaryAttribute {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	Object obj=ctx.getBean("wmg");
	WishMessageGenerator generator=(WishMessageGenerator)obj;
	String result=generator.generateWishMessage("Satya");
	System.out.println(result);
	
}
}
