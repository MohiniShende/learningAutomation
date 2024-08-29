package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
	public static void main(String[] args) {
	
		//create Object for SparkReport
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");

		//configure the report
		
		spark.config().setDocumentTitle("Regression Testing for the  RegeisterPage");
		
		spark.config().setReportName("RegressionSuite");
		
		spark.config().setTheme(Theme.DARK);
		
		//create the  Extent report
		ExtentReports report=new ExtentReports();
		
		//Attach the spark Report and ExtentReport
		report.attachReporter(spark);
		//configure the system information in Extent Report by Attaching 
		
		report.setSystemInfo("DeviceName:", "Mohini");
		report.setSystemInfo("OS", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", " chrome-127.0.6533.120 ");
		
		//create the test Information
		ExtentTest test= report.createTest("Regressiontest");
		
		//step information
		test.log(Status.INFO,"Step1: Launching the Browser Sucessfull");
		
		test.log(Status.INFO,"Step2: Navigating To Application via URI Sucessfull");
		
		test.log(Status.PASS,"Step3: Verified  the WebPage Sucessfull");
		
		test.log(Status.PASS,"Step4: Verified the WebElement  Sucessfull");
		if(true==true)
		{
		
		   test.log(Status.PASS,"step4:Verified the WebElement Displayed ");
		}
		else {
			
		
		  test.log(Status.FAIL,"Step4: Verified the Webelement not displayed");
		
		}
		test.log(Status.SKIP,"Step5: Element is Hidden");
		
		//flush the Reporter information
		report.flush();
		
		System.out.println("Execution done");
		
}
}
