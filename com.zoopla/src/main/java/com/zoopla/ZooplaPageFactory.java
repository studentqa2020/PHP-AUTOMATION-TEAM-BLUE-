package com.zoopla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZooplaPageFactory {

	public ZooplaPageFactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (xpath= "//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement cookie;

	//@FindBy (xpath= "//*[@data-ga-label='user account>sign in']")
	@FindBy (xpath="(//*[text()='Sign in'])[1]")
	private WebElement SignIn;
	
	@FindBy (xpath= "//*[@id='signin_email']")
	private WebElement Email;
	
	@FindBy (xpath = "//*[@id='signin_password']")
	private WebElement Password;
	
	@FindBy (xpath = "//*[@class='button button--primary button--wide']")
	private WebElement FinalSignIn;


	
	public WebElement getCookie() {
		return cookie;
	
	}
	public WebElement getSignIn() {
		return SignIn;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getFinalSignIn() {
		return FinalSignIn;
	}
	

}
