package com.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.bank.basetest.BaseTest;

public class AddCustomerPage extends BaseTest {

	
	
	
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean getfirstNamefeild() {
		return driver.findElement(By.xpath("//label[normalize-space()='First Name :']")).isDisplayed();
	}
	
	public boolean getLasttNamefeild() {
	return	driver.findElement(By.xpath("//label[normalize-space()='Last Name :']")).isDisplayed();
	}
	
	
	public boolean getpincodefeild() {
		return driver.findElement(By.xpath("//label[normalize-space()='Post Code :']")).isDisplayed();
	}

	public void createcustomer() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("201306");
		driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
		Thread.sleep(10000);
	}

}
