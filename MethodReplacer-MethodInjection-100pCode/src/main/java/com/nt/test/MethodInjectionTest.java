package com.nt.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		//Create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//Get Target class object reference
		BankService service=ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getDeclaredMethods()));
        //Invoke the business method
		double intrAmt=service.calculateIntrestAmount(100000,12,2);
		System.out.println("Intrest Amount is:"+intrAmt);
		
		//Close the container
		ctx.close();
	}

}
