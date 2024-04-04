package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
  
	@Autowired
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder::0-param constructor");
	}
	
	public String findoutSeasonName(String user) {
		System.out.println("SeasonFinder.findoutSeasonName()");
		//Get Current month value
		int month=date.getMonthValue();
		//Show season name
		if(month>=3&&month<=6)
			return "Hot Summer wishes to :"+user;
		else if(month>=7&&month<=10)
			return "Drizzling Monsoon wishes to :"+user;
		else
			return "Cool Winter wishes to:"+user;
	}
}
