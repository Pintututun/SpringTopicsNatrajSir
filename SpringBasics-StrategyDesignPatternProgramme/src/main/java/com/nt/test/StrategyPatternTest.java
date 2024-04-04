package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
public static void main(String[] args) {
	Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
	String resultMsg=fpkt.shopping(new String[] {"candles","flowers","cake","wine"},new double[] {1000.0,2000.0,1000.0,3000.0});
	System.out.println(resultMsg);
}
}
