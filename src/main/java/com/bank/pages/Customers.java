package com.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.bank.basetest.BaseTest;

public class Customers extends BaseTest{

	
	public Customers() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean getdeletebutton() {
		return driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).isDisplayed();
	}
	
	
	public void detelecustomer() {
		driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).click();
	}
}
