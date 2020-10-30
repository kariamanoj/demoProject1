package com.AutomationTalks.demoProject1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
public static WebDriver driver;
public static final String USERNAME = "qatester163";
public static final String AUTOMATE_KEY = "LYe9TbNzifwCC9zmBVbV";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException{
	

//		DesiredCapabilities dr = null;
		  DesiredCapabilities caps = new DesiredCapabilities();
	        
		  caps.setCapability("os", "Windows");
		  caps.setCapability("os_version", "10");
		  caps.setCapability("browser", "Chrome");
		  caps.setCapability("browser_version", "80");
		  caps.setCapability("name", "My First Test");
		  
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability("setBrowserName", "chrome");
//		options.setCapability("setPlatform", Platform.WIN10);
//		ChromeDriver dr = new ChromeDriver(options);
//		dr = DesiredCapabilities.chrome();
//		dr.setBrowserName("chrome");
//		dr.setVersion("85.0.4183.87");
//		dr.setPlatform(Platform.WIN10);
//		System.setProperty("webdriver.chrome.driver", "C:\\MK\\QA\\Automation\\Drivers\\chromedriver.exe"); 
//		driver = new ChromeDriver();
//		driver = new RemoteWebDriver(new URL("http://192.168.0.16:4444/wd/hub"), options);
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void Test1() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test1 Title is " + driver.getTitle());		
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test2 Title is " + driver.getTitle());	
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test3 Title is " + driver.getTitle());	
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();	
	}
}