package com.nt.test;

import com.nt.model.Customer2;

public class LombokTest2 {
public static void main(String[] args) {
	Customer2 c1=new Customer2(101,"Raja","Hyd",667.87);
	Customer2 c2=new Customer2(101,"Rajesh","Hyd",669.56);
    System.out.println(c1.hashCode()+" "+c2.hashCode());
    System.out.println(c1.equals(c2));
    System.out.println(c1==c2);
    Customer2 c3=new Customer2(101,"Raja","Hyd",667.87);
	Customer2 c4=new Customer2(101,"Raja","Hyd",667.87);
    System.out.println(c3.hashCode()+" "+c4.hashCode());
    System.out.println(c3.equals(c4));
    System.out.println(c3==c4);
    System.out.println(System.identityHashCode(c3));
    System.out.println(System.identityHashCode(c4));
 
}
}
