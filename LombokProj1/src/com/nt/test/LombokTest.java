package com.nt.test;

import com.nt.model.Customer;
import com.nt.model.Customer1;

public class LombokTest {
public static void main(String[] args) {
	Customer c1=new Customer();
	c1.setCno(101);
	c1.setCname("Priyabrata");
	c1.setCadd("Hyd");
	c1.setBillNo(12354);
	c1.setBillAmt(123.9);
	System.out.println(c1.getCno()+" "+c1.getCname()+" "+c1.getCadd());
    System.out.println(c1);
	Customer1 c2=new Customer1();
    c2.setCname("Jagan");
    c2.setCadd("Vizag");
    System.out.println(c2.getCname()+" "+c2.getCadd());
}
}
