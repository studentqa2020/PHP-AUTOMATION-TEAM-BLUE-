package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MainPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;

public class BaseLogin {

	
	public  static WebDriver getLogin() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get(BaseConfig.getConfigValue("URL"));
		driver.manage().window().maximize();
		
		MainPageFactory pf = new MainPageFactory(driver);
		
		Highlighter.getColor(driver, pf.getLogin());
		pf.getLogin().click();
		
		Highlighter.getColor(driver, pf.getEmail(),"blue");
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("Email"));
		
		Highlighter.getColor(driver, pf.getPassword(),"green");
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
		
		Highlighter.getColor(driver, pf.getSignin(),"yellow");
		pf.getSignin().click();
		
		return driver;
	
	}
}
