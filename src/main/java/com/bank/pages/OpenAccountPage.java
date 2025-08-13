package com.bank.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bank.basetest.BaseTest;

public class OpenAccountPage extends BaseTest{

	
	
	public OpenAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean getcustomerdropdown() {
		return driver.findElement(By.id("userSelect")).isDisplayed();
	}
	
	public boolean getcurrencydropdown() {
		return driver.findElement(By.id("currency")).isDisplayed();
	}
	
	public void process() {
	 WebElement user = 	driver.findElement(By.id("userSelect"));
	 user.click();
		Select sc =new Select(user);
		sc.selectByIndex(3);
		WebElement currency = 	driver.findElement(By.id("userSelect"));
		currency.click();
			Select sc2 =new Select(currency);
			sc2.selectByIndex(3);
			driver.findElement(By.xpath("//button[contains(text(),'Process')]")).click();
		/*Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println("******************" + message + "***********************");
		alert.accept();*/
		
	}


	
	
}
