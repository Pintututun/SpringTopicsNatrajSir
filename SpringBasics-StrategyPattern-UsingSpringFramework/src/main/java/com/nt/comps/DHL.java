package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {

	
	
	public DHL() {
		System.out.println("DHL:0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "order id "+oid+" order is set for delivery using DHL courier service";
	}

}
