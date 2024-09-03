
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
	String name=excellibrary.readData("RegisterDetails",1,0);
	String email=excellibrary.readData("RegisterDetails",1,1);
	String Password=excellibrary.readData("RegisterDetails",1,2);
	String mobileno=excellibrary.readData("RegisterDetails",1,3);
	String feedback =excellibrary.readData("RegisterDetails",1,4);
	
	
	
	
	javalibrary.pause(5000);
	
	webdriverlibrary.waitUntilElementFound();
	String exptitle ="LearningSelenium";
	String acttitle= webdriverlibrary.driver.getTitle();
	System.out.println(acttitle);
	
	//step 1 verify the register page 
	Assert.assertEquals(exptitle, acttitle ,"Verified Regiester Page");
	
	//step 3create an Object for regiester page
		RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
		
	boolean elementExpCondition  =true;
	boolean elementActualCondition  =regpage.getNametextfield().isDisplayed();
	
	//step 2 verify the element
	Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement---it is displayed");
	
	// perform 
	//step 4 perform action --enter name
	regpage.getNametextfield().sendKeys(name);
	
	//step 5 perform action ---clear
	regpage.getEmailtextfield().sendKeys(email);
	
	//step 6 perform action --enter passowrd`
	regpage.getPasswordtextfield().sendKeys(Password);
	
	//step 7 perform action ---enter mobile no.
	regpage.getMobiletextfield().sendKeys(mobileno);
	
	//Step 8 perform action enter feedback
	regpage.getFeedbacktextfield().sendKeys(feedback);
	Reporter.log("Register with valid data");
	
}

}
