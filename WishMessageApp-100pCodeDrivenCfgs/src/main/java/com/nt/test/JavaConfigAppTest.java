package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigAppTest {
public static void main(String[] args) {
	//Create IOC container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    //Get Target Spring Bean Class Object Reference
	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
	//Invoke the business method
	String result=generator.generateWishMessage("raja");
	System.out.println("Result is:"+result);
	
	//Close the container
	ctx.close();

}
}
