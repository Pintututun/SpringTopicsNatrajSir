package privateConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

	
	/*
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * InstantiationException, IllegalAccessException, IllegalArgumentException,
	 * InvocationTargetException { Class
	 * clazz=Class.forName("privateConstructor.A"); Constructor<A>
	 * con[]=clazz.getDeclaredConstructors(); A obj=con[0].newInstance(20);
	 * System.out.println(clazz.getDeclaredFields()[0]); }
	 */
	 
	
	 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
     IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
 Class<?> clazz = Class.forName("privateConstructor.A");

 // Getting the declared constructor
 Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);

 // Bypassing the access check
 constructor.setAccessible(true);

 // Creating an instance of class A
 A obj = (A) constructor.newInstance(42); // Pass the value you want to initialize the 'sum' field with

 // Accessing the private field 'sum'
 Field sumField = clazz.getDeclaredField("sum");
 sumField.setAccessible(true);

 try {
     // Retrieving the value of the private field 'sum'
     int sumValue = (int) sumField.get(obj);
     System.out.println("Initialized sum: " + sumValue);
 } catch (IllegalAccessException e) {
     e.printStackTrace();
 }
}
	 
}
