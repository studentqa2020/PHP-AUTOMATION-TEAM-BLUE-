package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.BoseConfig;
import com.util.Highlighter;
import com.util.SeleniumWait;

public class BaseLogin {

	public static WebDriver getDriverManage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BoseConfig.getConfigValue("url"));
		driver.manage().window().maximize();

		System.out.println("SETUP COMPLETED");
		return driver;
	}

	public static WebDriver getLogin(WebDriver driver) throws Throwable {
		System.out.println("TEST STARTED");

		MasterPageFactory pf = new MasterPageFactory(driver);

		Highlighter.getColor(driver, pf.getMyAccount());
		SeleniumWait.getExplicitWait(driver, pf.getMyAccount());
		pf.getMyAccount().click();

		Highlighter.getColor(driver, pf.getSignUp(), "red");
		SeleniumWait.getExplicitWait(driver, pf.getSignUp());
		pf.getSignUp().click();

		Highlighter.getColor(driver, pf.getFirstName(), "green");
		pf.getFirstName().sendKeys(BoseConfig.getConfigValue("firstname"));

		Highlighter.getColor(driver, pf.getLastName());
		pf.getLastName().sendKeys(BoseConfig.getConfigValue("lastname"));

		Highlighter.getColor(driver, pf.getMobileNumber());
		pf.getMobileNumber().sendKeys(BoseConfig.getConfigValue("mobilenumber"));

		Highlighter.getColor(driver, pf.getEmail());
		pf.getEmail().sendKeys(BoseConfig.getConfigValue("email"));

		Highlighter.getColor(driver, pf.getPassword());
		pf.getPassword().sendKeys(BoseConfig.getConfigValue("password"));

		Highlighter.getColor(driver, pf.getConfirmPassword().get(5));
		pf.getConfirmPassword().get(5).sendKeys(BoseConfig.getConfigValue("password"));

		Highlighter.getColor(driver, pf.getFinalSignUp());
		SeleniumWait.getExplicitWait(driver, pf.getFinalSignUp());
		pf.getFinalSignUp().submit();
		
		
		return driver;
	}
}
