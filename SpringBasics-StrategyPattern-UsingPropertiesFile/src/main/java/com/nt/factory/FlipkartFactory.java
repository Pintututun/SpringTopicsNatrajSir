package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
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
			//Load properties file content to java.util.Properties class obj
			props=new Properties();
			props.load(is);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Static factory method
	public static Flipkart getInstance()throws Exception{
		System.out.println("FlipkartFactory.getInstance()");
		//Get Dependent class name
		String courierClassName=props.getProperty("courier.classname");
		//Load the dependent class
		Class c=Class.forName(courierClassName);
		//Create the object for loaded class
		Constructor<Courier> cons[]=c.getDeclaredConstructors();
		Courier courier=cons[0].newInstance();
		
		//Create Target class object
		Flipkart fpkt=new Flipkart();
		//Assign Dependent class object to Target class object
		fpkt.setCourier(courier);
		return fpkt;
	}
}
