package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
//HAS-A-Property
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param constructor");
	}
     //Setter for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	//Business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//Get current hour of the day
		int hour=dateTime.getHour();
		//Generate the wish message
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good Afternoon:"+user;
		else if(hour<20)
		    return "Good Evening:"+user;
		else
			return "Good Night:"+user;
		
	}
	
	
}
