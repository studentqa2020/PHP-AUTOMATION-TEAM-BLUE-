package com.TestExecution;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;


public class SmokeTestingWithTestNG {
WebDriver driver;

@BeforeTest
	public void getDriverSetUp() throws Throwable{
		driver = BaseLogin.getDriverManage();
	}
	
@Test	
public void getTest() throws Throwable{
		driver = BaseLogin.getLogin(driver);
	}

@AfterTest
public void getClose() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
