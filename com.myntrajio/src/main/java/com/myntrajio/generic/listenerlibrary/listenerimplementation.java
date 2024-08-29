package com.myntrajio.generic.listenerlibrary;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.common.BaseClass;

public class listenerimplementation  extends BaseClass implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Taking SCreenshot --start --"+name+"",true);
		
		//perform TypeCasting -webdrivertype to TakeScreenshot 
		
		TakesScreenshot tsref=(TakesScreenshot)webdriverlibrary.static_driver;
		
		//call the Screenshot method  and save in temp path
		File temp =tsref.getScreenshotAs(OutputType.FILE);
		
		//Create a permanet path and save it 
		File permenent =new File("./src/test/resources/Screenshot/"+name+".png");
		
		//copy the file from temp to permenent
//		try {
//			FileHandler.copy(temp, permenent);
//		}
//		catch(IOException e)
	
		try {
			FileHandler.copy(temp, permenent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
