package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")

public class WishMessageGenerator {
//HAS-A-Property
	private LocalDateTime dateTime;
	private Date date;
	
    @Autowired
		public void setDateTime(LocalDateTime dateTime) {
    	System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}

   @Autowired
	public void setDate(Date date) {
	   System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	//Business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//Get current hour of the day
		System.out.println(dateTime+"  "+date);
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
