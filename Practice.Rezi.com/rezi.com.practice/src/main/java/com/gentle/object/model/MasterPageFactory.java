package com.gentle.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver diver){
		PageFactory.initElements(diver, this);
	}

	@FindBy(xpath = "(//*[text()='LOG IN'])[1]")
	private WebElement login;
	
	@FindBy(xpath = "(//*[@type='text'])[1]")
	private WebElement email;
	
	
	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@class='n-F p-b p-x p-d c-c p-j']")
	private WebElement finalLogin;
	
	
	
	
	public WebElement getLogin() {
		return login;
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
