package com.bank.basetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

	
	public static  WebDriver driver;
	
	
	public static void intilization() 
	{
	//	String browser = prop.getProperty("chrome");
		String browser = "chrome";
		if (browser  == "chrome") {
			driver = new ChromeDriver();
		}
		else if (browser == "Edge") {
			driver = new EdgeDriver();
		}
		else if (browser == "Firefox" ) {
			driver = new FirefoxDriver();
		}
		else if (browser == "Safari") {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Given browser is not avliable");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");	
}
}
