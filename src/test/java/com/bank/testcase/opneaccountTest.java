package com.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;
import com.bank.pages.OpenAccountPage;

public class opneaccountTest extends BaseTest{
	ManagerHome managerhometest;
	Loginpage loginPage;
	OpenAccountPage openacc;
	public  opneaccountTest() {
		super();
}
	
	
	@BeforeMethod
	public void Setup() {
		intilization();
		loginPage	= new  Loginpage();
		openacc	= new OpenAccountPage();
		  managerhometest = loginPage.dologin();
		  openacc = managerhometest.clickopenAccbuton();
	}
	

	@Test(priority =1)
	public void getuserfeildtest() {
		boolean userdd = openacc.getcustomerdropdown();
		Assert.assertTrue(userdd);
		
	}
	
	

	@Test(priority =2)
	public void getcurrency() {
		boolean currndd = openacc.getcurrencydropdown();
		Assert.assertTrue(currndd);
	}
	
	
	@Test(priority =3)
	public void openaccounttest() {
		openacc.process();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	
}
