package com.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.basetest.BaseTest;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.Loginpage;
import com.bank.pages.ManagerHome;

public class ManagerhomepageTest extends BaseTest {
	ManagerHome managerhometest;
	Loginpage loginPage;
	AddCustomerPage addcustPage;
	
	public ManagerhomepageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		intilization();
		loginPage	= new  Loginpage();
		addcustPage	= new AddCustomerPage();
		  managerhometest = loginPage.dologin();
	}
	
@Test(priority=1)
	public void displayaddcustomertest() {
		boolean addcusbtn = managerhometest.getaddcustomerbuton();
		Assert.assertTrue(addcusbtn);
	}
	
@Test(priority=2)
	public void displayopenaccounttest() {
	boolean opencusbtn = managerhometest.getopenaccountbuton();
	Assert.assertTrue(opencusbtn);
	}
	
@Test(priority=3)
  public void displaycustomertest() {
	boolean cust = managerhometest.getCustomerbuton();
	Assert.assertTrue(cust);
	}

@Test(priority=4)
public void vldclickAddcustbtn() {
	managerhometest.clickAddcustomerbuton();
}

@Test(priority=5)
public void vldclickopnaccbtn() {
	managerhometest.clickopenAccbuton();
}

@Test(priority=6)
public void vldclickcustbtn() {
	managerhometest.clickcustomerbuton();
}



  @AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
