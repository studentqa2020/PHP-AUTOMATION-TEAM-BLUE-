package com.testexecution;

import org.junit.runners.Parameterized.Parameters;
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
	@Parameters(name = "browser")
	public void getTest(String name) throws Throwable{
		System.out.println(name);
		driver = Baselogin.getLogin(driver);
	}
	
	@AfterTest
	public void getClose() throws Throwable{
		
		Thread.sleep(5000);
		driver.quit();
	}
}