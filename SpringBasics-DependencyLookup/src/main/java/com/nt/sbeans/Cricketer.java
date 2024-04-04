package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="classpath:com/nt/commons/Info.properties")
public class Cricketer {
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jerseyNo}")
	private int jerseyNo;
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public void fielding() {
		System.out.println(name+" with jerseyNo::"+jerseyNo+" is fielding");
	}
	
	public void bowling() {
		System.out.println(name+" with jerseyNo::"+jerseyNo+" is keeping the wickets");
	}
    
	public void wicketKeeping() {
		System.out.println(name+" with jerseyNo::"+jerseyNo+" is keeping the wickets");
	}
	
	public void batting() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//CricketBat bat=ctx.getBean("bat",CricketBat.class);
		CricketBat bat=ctx.getBean(CricketBat.class);
		
		int runs=bat.scoreRuns();
		System.out.println(name+" with "+jerseyNo+" has scored "+runs+"runs");
	}
}
