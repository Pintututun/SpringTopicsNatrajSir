package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comps.Flipkart;

public class StrategyDesignPattern_FactoryDesignPattern_Test {
public static void main(String[] args) {
	//Create IOC container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	//Get Target Spring Bean class object reference
	Flipkart fpkt=(Flipkart)ctx.getBean("fpkt");
	//Invoke the business method
	String resultMsg=fpkt.shopping(new String[] {"kurtha-paijama","pathaani","atthar","sweets"},new double[] {2000.0,300.0,1000.0,600.0});
	System.out.println(resultMsg);
	//Close the container
	ctx.close();
}
}
