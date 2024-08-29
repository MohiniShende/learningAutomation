package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.myntrajio.generic.common.BaseClass;
import com.myntrajio.generic.pagerepository.RegisterPage;
import com.myntrajio.generic.webdriverlibrary.WebDriverLibrary;

public class RegisterTest extends BaseClass {
@Test
public void registerValidData() {
	javalibrary.pause(5000);
	
	//step 1 verify the register page 
	Assert.assertEquals("title", "title","Verified Regiester Page");
	
	//step 2 verify the element
	Assert.assertEquals("element", "element","Verified Webelement");
	
	//step 3create an Object for regiester page
	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
	
	//step 4 perform action --enter name
	regpage.getNametextfield().sendKeys("mohini");
	
	//step 5 perform action ---clear
	regpage.getEmailtextfield().sendKeys("admin123@gmail.com");
	
	//step 6 perform action --enter passowrd
	regpage.getPasswordtextfield().sendKeys("admin@123#");
	
	//step 7 perform action ---enter mobile no.
	regpage.getMobiletextfield().sendKeys("9860208155");
	Reporter.log("Register with valid data");
	
}

}
