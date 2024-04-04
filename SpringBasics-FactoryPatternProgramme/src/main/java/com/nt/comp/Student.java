package com.nt.comp;

public class Student extends Person {
  
     private String course;
     private int rollno;
	public Student(String name, String addrs, AadharDetails aadhar, String course, int rollno) {
		super(name, addrs, aadhar);
		this.course = course;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [course=" + course + ", rollno=" + rollno + "]";
	}
     
   
   
}
