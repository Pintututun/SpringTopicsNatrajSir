package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	Object obj=ctx.getBean("sf");
	SeasonFinder finder=(SeasonFinder)obj;
	String result=finder.findoutSeasonName("Deepak");
	System.out.println(result);
	ctx.close();
}
}
