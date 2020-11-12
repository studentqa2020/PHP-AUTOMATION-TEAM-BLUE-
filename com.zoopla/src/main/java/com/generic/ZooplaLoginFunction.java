package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zoopla.ZooplaPageFactory;

import Zoopla.com.utility.Config;
import Zoopla.com.utility.Highlighter;

public class ZooplaLoginFunction {

	
	public static WebDriver getlogin() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Config.getconfig("URL"));
		driver.manage().window().maximize();
		
		ZooplaPageFactory pf = new ZooplaPageFactory(driver);
		
		Highlighter.getcolor(driver, pf.getCookie());
		pf.getCookie().click();
		
		Highlighter.getcolor(driver, pf.getSignIn(),"blue");
		pf.getSignIn().click();
		
		Highlighter.getcolor(driver, pf.getEmail(),"green");
		pf.getEmail().sendKeys(Config.getconfig("Email"));
		
		Highlighter.getcolor(driver, pf.getPassword(),"brown");
		pf.getPassword().sendKeys(Config.getconfig("Password"));
		
		Highlighter.getcolor(driver, pf.getFinalSignIn(),"black");
		pf.getFinalSignIn().click();
		
		return driver;

		
		
	}

}

