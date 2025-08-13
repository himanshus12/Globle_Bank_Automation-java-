package com.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.Customers;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;

public class customertest extends BaseTest {
	ManagerHome managerhometest;
	Loginpage loginPage;
	Customers customerPage;
	
	public customertest() {
		super();
	}
	
	
	@BeforeMethod
	public void Setup() {
		intilization();
		loginPage	= new  Loginpage();
		 customerPage = new Customers();		
		managerhometest = loginPage.dologin();
		customerPage = managerhometest.clickcustomerbuton();
	}
	
	@Test(priority =1)
	public void deletebuttonuitest() {
		boolean delbtn = customerPage.getdeletebutton();
		Assert.assertTrue(delbtn);
	}
	
	@Test(priority =2)
	public void deletecustomertes() {
		customerPage.detelecustomer();
	}
	

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
