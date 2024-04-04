package com.nt.test;

import com.nt.model.CustomerType;

public class LombokTest3 {
public static void main(String[] args) {
	CustomerType cust=new CustomerType(113,"Odisha");
	CustomerType cust1=new CustomerType(114,"Satya","Rairanpur",445.56);
	System.out.println(cust);
	System.out.println(cust1);
}
}
