package com.zoopla;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeTest;

import com.generic.ZooplaLoginFunction;

public class LoginJavaWithTestNG {

	WebDriver driver;
	
@Test
	public void getDriverSetUP() throws Throwable{
		driver =  ZooplaLoginFunction.getlogin();
	}
	
	public void getDriverClose() {
		
	}
}
