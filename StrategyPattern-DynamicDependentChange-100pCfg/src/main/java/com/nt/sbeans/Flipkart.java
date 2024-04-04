package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

	@Autowired
	@Qualifier("dPatner")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}
	
	public String shopping(String items[],double prices[]) {
		System.out.println("Flipkart.shopping()");
		//Calculate bill amount
		double billAmt=0.0;
		for(double p:prices) {
			billAmt+=p;
		}
		//Generator order id
		int oid=new Random().nextInt(100000);
		//Use courier
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having bill amount"+billAmt+"-->"+msg;
	}
	
}
