package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class ArbitaryMethodInjectionTest {
public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj=ctx.getBean("wmg");
	WishMessageGenerator generator=(WishMessageGenerator)obj;
	String result=generator.generateWishMessage("Pintu");
	System.out.println(result);
}
}
