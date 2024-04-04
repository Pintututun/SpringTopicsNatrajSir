package com.nt.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public final class BlueDart implements Courier {

	
	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+"Order id order is assigned to BlueDart for delivery";
	}

}
