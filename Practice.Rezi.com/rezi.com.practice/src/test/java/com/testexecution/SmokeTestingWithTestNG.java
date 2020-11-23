package com.testexecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Baselogin;

public class SmokeTestingWithTestNG {

	WebDriver driver;
	
	@BeforeTest
	public void getDriverSetUp() throws Throwable {
	
	driver = Baselogin.getDriverManage();
}
	@Test
	public void getTest() throws Throwable{
		
		driver = Baselogin.getLogin(driver);
	}
	
	@AfterTest
	public void getClose() throws Throwable{
		
		Thread.sleep(3000);
		driver.quit();
	}
}