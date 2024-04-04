package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	public String shopping(String items[],double prices[]) {
		System.out.println("Flipkart.shopping()");
		double billAmt=0.0;
		for(double p:prices) {
			billAmt+=p;
		}
		int oid=new Random().nextInt(1000000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"are purchased having bill amount"+billAmt+"--->"+msg;
	}
	
}
