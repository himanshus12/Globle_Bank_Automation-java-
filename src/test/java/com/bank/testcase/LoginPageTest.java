 package com.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;


public class LoginPageTest extends BaseTest {

	Loginpage loginPage;
	ManagerHome mhome;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		intilization();
		 loginPage = new Loginpage();	
	}
	
	@Test(priority =1)
	public void validateloginpageTitle() {
		String title = loginPage.getloginpageTitle();
		Assert.assertEquals(title, title);
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
