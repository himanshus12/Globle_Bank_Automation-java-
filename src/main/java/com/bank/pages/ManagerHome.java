package com.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.bank.basetest.BaseTest;

public class ManagerHome extends BaseTest{

	
	
	public ManagerHome(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean getaddcustomerbuton() {
	return driver.findElement(By.xpath("//button[@ng-click = 'addCust()']")).isDisplayed();
	}
	
	
	public boolean getopenaccountbuton() {
	return driver.findElement(By.xpath("//button[@ng-click = 'openAccount()']")).isDisplayed();
	}
	

	public boolean getCustomerbuton() {
		return driver.findElement(By.xpath("//button[@ng-click = 'showCust()']")).isDisplayed();
		}

	public AddCustomerPage clickAddcustomerbuton() {
		 driver.findElement(By.xpath("//button[@ng-click = 'addCust()']")).click();
		 return new AddCustomerPage();
		}
	
	public OpenAccountPage clickopenAccbuton() {
		driver.findElement(By.xpath("//button[@ng-click = 'openAccount()']")).click();
		return new OpenAccountPage();
		}
	public Customers clickcustomerbuton() {
		driver.findElement(By.xpath("//button[@ng-click = 'showCust()']")).click();
	return	new Customers();
		}
}
