package com.TestExecution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class SmokeTest {

	
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		
		driver = BaseLogin.getDriverManage();
		driver = BaseLogin.getLogin(driver);
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Run Successfully");
		
	}
}
