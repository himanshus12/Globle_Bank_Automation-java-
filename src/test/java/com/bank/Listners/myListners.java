package com.bank.Listners;

import org.testng.ITestListener;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	// Example if you're using Extent Reports
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

	public class myListners implements ITestListener{

	    private static final Logger logger = LogManager.getLogger(myListners.class);

	    // Extent Reports objects
	    private static ExtentReports extent;
	    private static ExtentTest test;

	    LocalDateTime MYobj = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YY_HH-mm");
	    String Formatteddatetime = MYobj.format(formatter);
	    
	    
	    public void onStart(ITestContext context) {
	        logger.info("==== Test Suite Started: " + context.getName() + " ====");

	   String reportpath = System.getProperty("user.dir")+ "/reports/extentReports_"+Formatteddatetime+".html";
	   ExtentSparkReporter sparkreport = new ExtentSparkReporter(reportpath);
	   sparkreport.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	   sparkreport.config().setTheme(Theme.STANDARD);
	   sparkreport.config().setReportName("Automation TestCase Report");
	   sparkreport.config().setDocumentTitle("Test Result");
	   extent = new ExtentReports();
	   extent.attachReporter(sparkreport);
	   extent.setSystemInfo("Project Name", "Banking Automation");
       extent.setSystemInfo("Tester", "Himanshu Sharma");
       extent.setSystemInfo("Environment", "QA");
       extent.setSystemInfo("Browser", "Chrome 139");

	        logger.info("Extent Report initialized.");
	    }

	    
	    public void onFinish(ITestContext context) {
	        logger.info("==== Test Suite Finished: " + context.getName() + " ====");

	        // Flush the report (VERY important to write logs to file)
	        if (extent != null) {
	            extent.flush();
	            logger.info("Extent Report flushed successfully.");
	        }
	    }

	    
	    public void onTestStart(ITestResult result) {
	        logger.info("🟢 Test Started: " + result.getMethod().getMethodName());

	        // Create ExtentTest entry for each test
	        test  = extent.createTest(result.getMethod().getMethodName());
	       
	    }

	    
	    public void onTestSuccess(ITestResult result) {
	        logger.info("✅ Test Passed: " + result.getMethod().getMethodName());
	        test.pass("Test Passed");
	    }

	    
	    public void onTestFailure(ITestResult result) {
	        logger.error("❌ Test Failed: " + result.getMethod().getMethodName());
	        logger.error("Reason: " + result.getThrowable());

	        test.fail("Test Failed: " + result.getThrowable());

	        // 👉 Screenshot capture code can be added here if using Selenium
	    }

	    
	    public void onTestSkipped(ITestResult result) {
	        logger.warn("⚠️ Test Skipped: " + result.getMethod().getMethodName());
	        test.skip("Test Skipped: " + result.getThrowable());
	    }

	    
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        logger.warn("Test failed but within success %: " + result.getMethod().getMethodName());
	    }
	}

