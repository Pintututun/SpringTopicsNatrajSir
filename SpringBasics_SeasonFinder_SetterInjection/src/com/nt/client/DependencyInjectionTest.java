package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
public static void main(String[] args) {
	//Create IOC container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	//Get the Spring bean class object from IOC container
	Object obj=ctx.getBean("sf");
	SeasonFinder season=(SeasonFinder)obj;
	String result=season.getSeason("Raja");
	System.out.println(result);
}
}
