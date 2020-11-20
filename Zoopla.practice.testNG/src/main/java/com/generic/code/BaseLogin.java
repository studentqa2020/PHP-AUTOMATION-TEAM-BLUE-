package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.SeleniumWait;

public class BaseLogin {

	public static WebDriver getDriverManage() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfigValue("url"));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static WebDriver getLogin(WebDriver driver) throws Throwable{
		
		MasterPageFactory pf = new MasterPageFactory(driver);
		
		Highlighter.getcolor(driver, pf.getCookies(),"brown");
		SeleniumWait.getExplicitWait(driver, pf.getCookies());
		pf.getCookies().click();
		
		Highlighter.getcolor(driver, pf.getSignin());
		SeleniumWait.getExplicitWait(driver, pf.getSignin());
		pf.getSignin().click();
		
		Highlighter.getcolor(driver, pf.getEmail(),"blue");
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));
		
		Highlighter.getcolor(driver, pf.getPassword(),"green");
		pf.getPassword().sendKeys(BaseConfig.getConfigValue("pass"));
		
		Highlighter.getcolor(driver, pf.getFinalsignin(),"violet");
		SeleniumWait.getExplicitWait(driver, pf.getFinalsignin());
		pf.getFinalsignin().click();
		
		//Highlighter.getcolor(driver, pf.getForsale());
		//pf.getForsale().click();
		
		//pf.getTablerows().forEach(each ->{
		//	Highlighter.getcolor(driver, each);
		//	System.out.println(each.getText());
		//});
		
		
		//Highlighter.getcolor(driver, pf.getTablerows().get(0));
		//System.out.println(pf.getTablerows().get(0).getText());
		return driver;
	}
	
}
