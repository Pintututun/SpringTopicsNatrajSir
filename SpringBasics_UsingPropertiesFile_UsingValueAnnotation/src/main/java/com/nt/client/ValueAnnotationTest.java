package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonalInfo;

public class ValueAnnotationTest {
public static void main(String[] args) {
	
	//Create the IOC container
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    
     //Get Spring Bean class obj ref
	PersonalInfo info=ctx.getBean("pInfo",PersonalInfo.class);
	System.out.println(info);
	
	//Close the container
	ctx.close();
}
}
