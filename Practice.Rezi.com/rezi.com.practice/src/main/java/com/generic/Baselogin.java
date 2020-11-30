package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gentle.object.model.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.SeleniumWait;

public class Baselogin {

	public static WebDriver getDriverManage() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfigValue("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static WebDriver getLogin(WebDriver driver) throws Throwable{
		MasterPageFactory pf = new MasterPageFactory(driver);
		
		//Highlighter.getColor(driver, pf.getLogin());
		SeleniumWait.getExplicitWait(driver, pf.getLogin());
		pf.getLogin().click();
		
		
		Highlighter.getColor(driver, pf.getEmail());
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));
		
		
		
		Highlighter.getColor(driver, pf.getPassword());
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		
		
		Highlighter.getColor(driver, pf.getFinalLogin());
		SeleniumWait.getExplicitWait(driver, pf.getFinalLogin());
		pf.getFinalLogin().click();
		
		return driver;
	}
}
