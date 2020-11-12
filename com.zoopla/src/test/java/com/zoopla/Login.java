package com.zoopla;

import org.openqa.selenium.WebDriver;

import com.generic.ZooplaLoginFunction;

public class Login {
	
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		driver =  ZooplaLoginFunction.getlogin();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}
}
