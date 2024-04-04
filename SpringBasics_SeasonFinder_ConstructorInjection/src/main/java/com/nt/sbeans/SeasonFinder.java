package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
 @Autowired
 private LocalDate date;
 
 public SeasonFinder() {
    System.out.println("SeasonFinder.SeasonFinder()");
 }
 
 public String findoutSeasonName(String user) {
	 System.out.println("SeasonFinder.findoutSeasonName()");
	 //Get current month value
	 int month=date.getMonthValue();
	 //Show the season name
	 if(month>=3&&month<=6)
		 return "Hot Summer wishes to:"+user;
	 else if(month>=7&&month<=10)
		 return "Drizzling Monsson wishes to:"+user;
	 else
		 return "Cool Winter wishes to:"+user;
 }
}
