 package com.bank.testcase;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;
import org.apache.logging.log4j.LogManager;



public class LoginPageTest extends BaseTest {
	
	 private static final Logger logger = LogManager.getLogger(LoginPageTest.class);

	Loginpage loginPage;
	ManagerHome mhome;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		intilization();
		 loginPage = new Loginpage();
		 logger.info("Application_setup Sucessfully");
	}
	
	@Test(priority =1)
	public void validateloginpageTitle() {
		String title = loginPage.getloginpageTitle();
		Assert.assertEquals(title, title);
		logger.info("validateloginpageTitle Test case is title os matcheeed ");
	}
	
	@Test(priority =2)
	public void validatemanloginbutton() {
		boolean button = loginPage.getmanagerlogin();
		 Assert.assertTrue(button);
	}
	
	@Test(priority =3)
	public void validatedologin() {
		mhome = loginPage.dologin();
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
