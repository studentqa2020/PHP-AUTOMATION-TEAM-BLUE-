package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public  MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//*[@class='dropdown dropdown-login dropdown-tab']")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//*[@class='dropdown-item tr']")
	private WebElement SignUp;
	
	@FindBy(xpath ="//*[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//*[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath = "//*[@name='phone']")
	private WebElement MobileNumber;
	
	@FindBy(xpath ="//*[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@class='pure-material-textfield-outlined float-none']")
	private List<WebElement> ConfirmPassword;
	
	@FindBy (xpath = "//*[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
	private WebElement FinalSignUp;
	
	public WebElement getMyAccount() {
		return MyAccount;
	}
	public WebElement getSignUp() {
		return SignUp;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getMobileNumber() {
		return MobileNumber;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public List<WebElement> getConfirmPassword() {
		return ConfirmPassword;
	}
	public WebElement getFinalSignUp() {
		return FinalSignUp;
	}
	
	


}
