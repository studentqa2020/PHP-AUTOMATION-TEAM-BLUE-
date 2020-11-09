package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PHPPageFactory {

	public PHPPageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@class,'dropdown dropdown-login dropdown-tab')]")
	private WebElement myAccount;

	@FindBy(xpath = "//*[contains(@class,'dropdown-item active tr')]")
	private WebElement login;
	
	@FindBy(xpath = "//*[contains(@name,'username')]")
	private WebElement email;
	
	@FindBy(xpath = "//*[contains(@name,'password')]")
	private WebElement Password;
	
	@FindBy(xpath = "//*[contains(@class,'btn btn-primary btn-lg btn-block loginbtn')]")
	private WebElement finalLogin;

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getFinalLogin() {
		return finalLogin;
	}

}
