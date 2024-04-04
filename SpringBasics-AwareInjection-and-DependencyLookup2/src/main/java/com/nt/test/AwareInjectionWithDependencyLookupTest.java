package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class AwareInjectionWithDependencyLookupTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		
		cktr.batting();
		cktr.bowling();
		cktr.fielding();
         
		ctx.close();
	}

}
