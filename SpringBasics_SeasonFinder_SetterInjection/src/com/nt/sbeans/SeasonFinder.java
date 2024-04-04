package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
  
	private LocalDate ld;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:0-param constructor");
	}

	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}
	
	//Business Method
	public String getSeason(String user) {
		int value=ld.getMonthValue();
		if(value<=3)
			return "Winter Season:"+user;
		else if(value<=7)
			return "Summer Season:"+user;
		else
			return "Rainy Season:"+user;
			
		
	}
	
	
	
	
}
