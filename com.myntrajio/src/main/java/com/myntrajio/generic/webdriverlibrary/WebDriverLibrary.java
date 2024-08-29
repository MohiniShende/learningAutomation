package com.myntrajio.generic.webdriverlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLibrary {
	 
	 
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;
	
	/**
	 * this method launches specified browser
	 * @param browser
	 * @return
	 */
	
	
	 
	public WebDriver LaunchBrowser(String browser) {
		switch (browser){
			case "chrome":
				
				driver = new ChromeDriver();
				 static_driver=driver;
				break;
			
			case "firefox":
				
				driver = new FirefoxDriver();
				 static_driver=driver;
				break;
			case "edge":
				
				driver = new EdgeDriver();
				 static_driver=driver;
				break;
				
				default:
					System.out.println("Invalid browser info");
				
		}
		return driver;
	}
	
	
	//maximum the browser
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	/** 
	 * this method is used to navigate to the application 
	 * 
	 * @param url 
	 */
	 public void navigateToApp(String url) {
		 driver.get(url);
	 }
	 /** 
	  * this method watits until elemnt is visible on the web page
	  * 
	  * @param time
	  * @param element
	  * @retur
	  * 
	  */
	 public void waitUntilElementFound(long time) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public void expliciWait(long time,WebElement element) {
	 WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds(time));
	 wait.until(ExpectedConditions.visibilityOf(element));
	}
	 /** 
	  * this method is used to mouse hover on an element
	  * @param element
	  */
	
	 public void closeWindow() {
		 driver.close();
	 }
	 /**
	  * This method is used to close all the opened tabs or windows
	  * 
	  */
	 public void quitALLWindows() {
		 driver.quit();
		 
		 
		 
	 }
}
	 
	


