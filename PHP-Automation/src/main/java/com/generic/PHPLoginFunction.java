package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.PHPPageFactory;
import com.utility.Config;
import com.utility.Highlighter;

public class PHPLoginFunction {

	
	public static WebDriver getlogin() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Config.getConfig("URL"));
		driver.manage().window().maximize();
		
		PHPPageFactory pf = new PHPPageFactory(driver);
		
		Highlighter.getcolor(driver, pf.getMyAccount());
		pf.getMyAccount().click();
		
		Highlighter.getcolor(driver, pf.getLogin(),"green");
		pf.getLogin().click();
		
		Highlighter.getcolor(driver, pf.getEmail(),"blue");
		pf.getEmail().sendKeys(Config.getConfig("Email"));
		
		Highlighter.getcolor(driver, pf.getPassword(),"brown");
		pf.getPassword().sendKeys(Config.getConfig("Password"));
		
		Highlighter.getcolor(driver, pf.getFinalLogin(),"yellow");
		pf.getFinalLogin().click();
		return driver;
		
	}
	
}
