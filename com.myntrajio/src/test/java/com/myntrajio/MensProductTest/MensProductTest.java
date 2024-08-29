package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.listenerimplementation.class)
public class MensProductTest {
	@Test(groups = {"FT","RT"})
	public void addProduct() {
		Reporter.log("Mens Product added sucess",true);
	}
	
  @Test(groups={"IT","RT"})
  public void removeProduct() {
		Reporter.log("Mens Product remove sucess",true);
	}
	
  @Test(groups={"ST","RT"})
  public void updateProduct() {
		Reporter.log("Mens Product update sucess",true);
	}
}


