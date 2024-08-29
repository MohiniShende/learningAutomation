package com.myntrajio.ElectronicProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.listenerimplementation.class)

public class ElectronicProductTest {
	@Test(groups = {"FT","RT"})
	public void addProduct() {
		Reporter.log("Electronic Product added sucess",true);
	}
	
  @Test(groups={"IT","RT"})
  public void removeProduct() {
		Reporter.log("Electronic Product remove sucess",true);
	}
	
  @Test(groups={"ST","RT"})
  public void updateProduct() {
		Reporter.log("Electronic Product update sucess",true);
	}
}
