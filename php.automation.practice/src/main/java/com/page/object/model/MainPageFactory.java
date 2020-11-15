package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageFactory {
	
	public MainPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@class= 'login']")
	private WebElement login;
	
	@FindBy(xpath = "//*[@id= 'email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id= 'passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id= 'SubmitLogin']")
	private WebElement signin;
	
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}

}
