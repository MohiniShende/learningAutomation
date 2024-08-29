package com.myntrajio.generic.propertyfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


import org.testng.Reporter;

import com.myntrajio.generic.common.Frameworkconstant;

public class ReadPropertyfile implements Frameworkconstant {
	FileInputStream fis =null;
	FileOutputStream fos=null;
	Properties property= null;
	

	public String readData(String key) {
		// create an object of FileInputStream
		//converting physical file into java understandable 
		
		try {
	   fis 	= new FileInputStream(propertypath);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		
		//create an object for properties class 
		Properties  Property =new Properties();
		
		//load the property file
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		//fetch the data by calling getproperty
		String data =property.getProperty(key);
	
		return data;
	}
public void writeData(String key,String value) {
	
	//enter the data
	property.put(key, value);
	
	//create instance for fileoutputstream class
	
	
		 try {
			fos =new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  //store the data
		 try {
			property.store(fos, "Updated the new Key_Value Sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}



	
	


public void displayData(String key) {
	// create an object of FileInputStream
			//converting physical file into java understandable
			
			try {
		   fis 	= new FileInputStream(propertypath);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
			//create an object for properties class 
			Properties  Property =new Properties();
			
			//load the property file
			try {
				property.load(fis);
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}
			
			//fetch the data by calling getproperty
			String data =property.getProperty(key);
			Reporter.log(key+":"+data,true);
}
}

			
		