package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.BoseConfig;
import com.util.Highlighter;
import com.util.SeleniumWait;

public class BaseLogin {

	public static WebDriver getDriverManage()  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(BoseConfig.getConfigValue("url"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		System.gc();
		System.out.println("SETUP COMPLETED");
		return driver;
	}

	public static WebDriver getLogin(WebDriver driver)  {
		System.out.println("TEST STARTED");

		MasterPageFactory pf = new MasterPageFactory(driver);

		Highlighter.getColor(driver, pf.getMyAccount());
		SeleniumWait.getExplicitWait(driver, pf.getMyAccount());
		pf.getMyAccount().click();

		Highlighter.getColor(driver, pf.getSignUp(), "red");
		SeleniumWait.getExplicitWait(driver, pf.getSignUp());
		pf.getSignUp().click();

		Highlighter.getColor(driver, pf.getFirstName(), "green");
		try {
			pf.getFirstName().sendKeys(BoseConfig.getConfigValue("firstname"));
			pf.getLastName().sendKeys(BoseConfig.getConfigValue("lastname"));
			pf.getMobileNumber().sendKeys(BoseConfig.getConfigValue("mobilenumber"));
			pf.getEmail().sendKeys(BoseConfig.getConfigValue("email"));
			pf.getPassword().sendKeys(BoseConfig.getConfigValue("password"));
			pf.getConfirmPassword().get(5).sendKeys(BoseConfig.getConfigValue("password"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Highlighter.getColor(driver, pf.getLastName());
		Highlighter.getColor(driver, pf.getMobileNumber());
		Highlighter.getColor(driver, pf.getEmail());
		Highlighter.getColor(driver, pf.getPassword());
		Highlighter.getColor(driver, pf.getConfirmPassword().get(5));
		 
		 
		/*
		 * List<WebElement> ConfirmPassword = driver.findElements(By.
		 * xpath("//*[@class='pure-material-textfield-outlined float-none']"));
		 * ConfirmPassword.get(5).sendKeys("smarttech");
		 */
		
		Highlighter.getColor(driver, pf.getFinalSignUp());
		SeleniumWait.getExplicitWait(driver, pf.getFinalSignUp());
		pf.getFinalSignUp().submit();
		
		
		return driver;
	}
}
