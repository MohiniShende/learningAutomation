package com.myntrajio.generic.common;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass extends ObjectLibrary {
	
	
	
	 @BeforeSuite
	 public void getSuiteConnections() {
		 Reporter.log("get suiteconnection done sucessfull",true);
		 
	 }
	 @BeforeTest
	 public void precondition() {
		 Reporter.log("precondition done sucessfull",true);
	 }
	 @Parameters("browser")
	 @BeforeClass
	
	 
	public void browserSetup(String bname)
	{
		//create object for all library
		 createObject();
		 // step1 :launcth browser
		 webdriverlibrary.LaunchBrowser(bname);
		 
		 //fetch urldata property file 
		// String URL =  propertyfilelibrary.readData("url");
		 
		 //maximize the browser
		 webdriverlibrary.maximizeBrowser();
		 
		 //step 2 navigate to the application via url
		 webdriverlibrary.navigateToApp("file:///C:/Users/mohin/eclipse-workspace/com.myntrajio/src/test/resources/WebPage/webpage.html");
		 
		 Reporter.log("BrowserSetup:"+bname +"Sucessfull",true);
		 
	}
	 
	 @BeforeMethod
	 public void login() {
		 
			 Reporter.log("login Sucessfull",true); 
		 }
	 @AfterMethod
	 public void logout() {
		 
			 Reporter.log("logout Sucessfull",true); 
		 }
	 
	 @AfterClass
	 public void closeBrowser() {
		 //close browser s
		 webdriverlibrary.closeWindow();
		 
		 Reporter.log("closeBrowser Sucessfull",true);
		 
	 }
	 
	@AfterTest
	
	public void postcondition() {
		 Reporter.log("precondition done sucessfull",true);
	 }
	
	 
	 
		 
		 
	}
	
	
	


