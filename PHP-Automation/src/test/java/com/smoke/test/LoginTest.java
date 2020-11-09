package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.PHPLoginFunction;

public class LoginTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		//call the methods and run
		
		
		driver =PHPLoginFunction.getlogin();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
