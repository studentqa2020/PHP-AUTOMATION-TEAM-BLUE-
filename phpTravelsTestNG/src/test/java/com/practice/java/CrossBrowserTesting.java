package com.practice.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	@Test
	@Parameters (value= "Browser")
	public void getMyBrowser(String value){
		
		System.out.println(value);
		
		if(value.equals("Chrome")) {
			//open chrome browser
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			driver.quit();
			
		}else if(value.equals("IE")) {
			//open ie browser
			
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.close();
			
		}else if(value.equals("Firefox")) {
			//open firefox browser
			
			System.setProperty("webdriver.gecko.driver", "path");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
	
		}else {
			System.out.println("Browser not found");
		}
		
	}
}
