package com.bank.basetest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	 private static final Logger logger = LogManager.getLogger(BaseTest.class);


	
	
	public static WebDriver driver;
	public static Properties prop;
	

	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	
	
	
	
	public BaseTest(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/bank/confiug/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void intilization(){
		logger.info("Browser is satrk invokeing");
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			
			driver = new FirefoxDriver(); 
		}
		
		/*
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(prop.getProperty("url"));
		logger.info("Browser is  invokeed sucessfully");
	}
	
	
	
	
	
	
	
	

}