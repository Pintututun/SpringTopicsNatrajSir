package com.nt.test;

import java.io.Serializable;
import java.util.Arrays;

public class App1 implements Serializable {

	public static void main(String[] args) {
		Class c1=App1.class;
		System.out.println("c1 object class name:"+c1.getClass());
		System.out.println("c1 object data:"+c1.toString());
		System.out.println("c1 object data class name:"+c1.getName());
		System.out.println("c1 object data class super class name:"+c1.getSuperclass());
		System.out.println("c1 object data class list of implemented interfaces:"+Arrays.toString(c1.getInterfaces()));
		System.out.println("c1 object data class list of methods:"+Arrays.toString(c1.getDeclaredMethods()));
		System.out.println("==========================================================");
		Class c2=System.class;
		System.out.println("c2 object class name:"+c2.getClass());
		System.out.println("c2 object data:"+c2.toString());
		System.out.println("c2 object data class name:"+c2.getName());
		System.out.println("c2 object data class super class name:"+c2.getSuperclass());
		System.out.println("c2 object data class list of implemented interfaces:"+Arrays.toString(c2.getInterfaces()));
		System.out.println("c2 object data class list of methods:"+Arrays.toString(c2.getDeclaredMethods()));

	}

}
