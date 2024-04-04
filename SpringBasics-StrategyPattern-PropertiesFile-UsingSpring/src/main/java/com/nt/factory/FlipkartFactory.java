package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.nt.comps.Courier;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		System.out.println("FlipkartFactory.static block");
		try {
			//Locate properties file through stream
			InputStream is=new FileInputStream("src/main/java/com/nt/commons/info.properties");
		    //Load properies file content to java.util.Properties class obj
			props=new Properties();
			props.load(is);
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
			System.out.println("File not found");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Errror loading properties file");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unexpected error");
		}
	}
	//static factory method
 public static Flipkart getInstance() throws Exception{
	//Create Dependent class obj
	 String courierClassName=props.getProperty("courier.className");
	 System.out.println("Courier class name"+courierClassName);
	 //Load the dependent class
	 Class c=Class.forName(courierClassName);
	 //Create the object for loaded class
	 Constructor<Courier> cons[]=c.getDeclaredConstructors();
	 Courier courier=cons[0].newInstance();
	 //Create Target class obj
	 Flipkart fpkt=new Flipkart();
	 //Assign dependent class obj to target class obj
	 fpkt.setCourier(courier);
	 return fpkt;
	 
 }

}
