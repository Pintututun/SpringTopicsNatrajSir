package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//Create IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//Get Target Spring Bean class Object Reference
		Object obj=ctx.getBean("sf");
		//Type casting
		SeasonFinder finder=(SeasonFinder)obj;
		//Invoke the business method
		String result=finder.findoutSeasonName("raja");
		System.out.println(result);
		
		//Close the conatiner
		ctx.close();
	
	}

}
