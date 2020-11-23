package com.gentle.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver diver){
		PageFactory.initElements(diver, this);
	}

	
	
	@FindBy(xpath = "//*[@class='layout-row layout-align-center-center x-C x-k x-l']")
	private WebElement login;
	
	@FindBy (xpath = "//*[@class='j-r']")
	private List<WebElement> EmailAddress;
	
	@FindBy(xpath = "//*[@class='j-a j-b']")
	private WebElement email;
	
	
	@FindBy (xpath = "//*[@class='j-r']")
	private List<WebElement> EnterPassword;
	
	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@class='n-F p-b p-x p-d c-c p-j']")
	private WebElement finalLogin;
	
	
	
	public WebElement getLogin() {
		return login;
	}
	
	public List<WebElement> getEmailAddress() {
		return EmailAddress;
	}

	public List<WebElement> getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getFinalLogin() {
		return finalLogin;
	}
}
