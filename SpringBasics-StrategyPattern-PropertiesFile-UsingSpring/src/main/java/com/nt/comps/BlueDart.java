package com.nt.comps;

public final class BlueDart implements Courier {

	public BlueDart() {
		super();
		System.out.println("BlueDart::0-param constructor");
		
	}
	@Override
	public String deliver(int oid) {
		return oid+"order id is assigned to BlueDart for Delivery";
	}
    
	
}
