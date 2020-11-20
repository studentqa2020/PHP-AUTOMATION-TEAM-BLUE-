package com.generic.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.page.object.model.MainPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.SeleniumWait;

public class BaseLogin {

	public static  WebDriver getDriverManager() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get(BaseConfig.getConfigValue("URL"));
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Driver Setup Finished");
		return driver;
	}
	
	
	
	public  static WebDriver getLogin(WebDriver driver) throws Throwable {
	System.out.println("ACTUAL TEST STARTED");
		
		
		MainPageFactory pf = new MainPageFactory(driver);
		
		SeleniumWait.getExplicitWait(driver, pf.getLogin());
		Highlighter.getColor(driver, pf.getLogin());
		pf.getLogin().click();
		
		
		Highlighter.getColor(driver, pf.getEmail(),"blue");
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		
		
		Highlighter.getColor(driver, pf.getPassword(),"green");
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		
		SeleniumWait.getExplicitWait(driver, pf.getSignin());
		Highlighter.getColor(driver, pf.getSignin(),"yellow");
		pf.getSignin().click();
		
		return driver;
	
	}
}
