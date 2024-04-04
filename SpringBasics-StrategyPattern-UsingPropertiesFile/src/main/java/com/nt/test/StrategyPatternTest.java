package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
public static void main(String[] args) {
	try {
		//Get Target class object(Flipkart class object)from Factory
		Flipkart fpkt=FlipkartFactory.getInstance();
		//Invoke the business method
		String resultMsg=fpkt.shopping(new String[] {"candles","flowers","cake","wine"},new double[] {1000.0,2000.0,1000.0,3000.0});
		//Display results
		System.out.println(resultMsg);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
