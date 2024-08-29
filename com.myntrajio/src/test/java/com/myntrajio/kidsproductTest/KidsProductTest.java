package com.myntrajio.kidsproductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.listenerimplementation.class)
public class KidsProductTest {
	@Test(groups = {"FT","RT"})
	public void addProduct() {
		Reporter.log("Kids Product added sucess",true);
	}
	
  @Test(groups={"IT","RT"})
  public void removeProduct() {
		Reporter.log("Kids Product remove sucess",true);
	}
	
  @Test(groups={"ST","RT"})
  public void updateProduct() {
		Reporter.log("Kids Product update sucess",true);
	}
}



