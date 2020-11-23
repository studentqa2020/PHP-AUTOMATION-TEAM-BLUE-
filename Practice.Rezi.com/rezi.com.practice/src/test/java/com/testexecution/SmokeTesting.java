package com.testexecution;

import org.openqa.selenium.WebDriver;

import com.generic.Baselogin;

public class SmokeTesting {

	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
	 
		driver = Baselogin.getDriverManage();
		driver = Baselogin.getLogin(driver);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
