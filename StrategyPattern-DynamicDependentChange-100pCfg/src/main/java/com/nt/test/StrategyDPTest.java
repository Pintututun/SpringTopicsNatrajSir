package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		// Create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get Target spring bean class object
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//Invoke the business method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},new double[] {1000.0,3000.0,500.0});
		System.out.println(msg);

	}

}
