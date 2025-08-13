package com.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.bank.basetest.BaseTest;

public class Loginpage extends BaseTest{

	
	public Loginpage() {
		
		PageFactory.initElements(driver, this );
	}
	
	
	public String getloginpageTitle() {
		 return driver.getTitle();
	}
	
	
	public boolean getmanagerlogin() {
		return driver.findElement(By.xpath("//button[contains(text(), 'Bank Manager Login')]")).isDisplayed();
	}
	
	public ManagerHome dologin() {
		driver.findElement(By.xpath("//button[contains(text(), 'Bank Manager Login')]")).click();
		
		return new ManagerHome();
	}
}
