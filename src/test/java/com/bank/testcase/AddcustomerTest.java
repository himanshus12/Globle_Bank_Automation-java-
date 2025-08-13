 package com.bank.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;

public class AddcustomerTest  extends BaseTest{

	
	ManagerHome managerhometest;
	Loginpage loginPage;
	AddCustomerPage addcustPage;
	
	
	public AddcustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		intilization();
		loginPage	= new  Loginpage();
		addcustPage	= new AddCustomerPage();
		  managerhometest = loginPage.dologin();
		  addcustPage = managerhometest.clickAddcustomerbuton();
	}
	
	@Test(priority=1)
	public void vldfirstNameTest() {
		boolean Fname = addcustPage.getfirstNamefeild();
		Assert.assertTrue(Fname);
	}
	
	@Test(priority=2)
public void vldlastnameTest() {
	boolean lname = addcustPage.getLasttNamefeild();
	Assert.assertTrue(lname);
}

	@Test(priority=3)
public void vldpincodeTest() {
boolean pincode = addcustPage.getpincodefeild();
Assert.assertTrue(pincode);
}

	@Test(priority=4)
public void vldaddcustTest() throws InterruptedException {
	addcustPage.createcustomer();
}



	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
