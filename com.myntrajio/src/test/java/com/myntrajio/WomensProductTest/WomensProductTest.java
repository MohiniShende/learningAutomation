package com.myntrajio.WomensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.listenerimplementation.class)
public class WomensProductTest {
	@Test(groups = {"FT","RT"})
	public void addProduct() {
		Reporter.log("womens Product added sucess",true);
	}
	
  @Test(groups={"IT","RT"})
  public void removeProduct() {
		Reporter.log("Womens Product remove sucess",true);
	}
	
  @Test(groups={"ST","RT"})
  public void updateProduct() {
		Reporter.log("Womens Product update sucess",true);
	}
}


