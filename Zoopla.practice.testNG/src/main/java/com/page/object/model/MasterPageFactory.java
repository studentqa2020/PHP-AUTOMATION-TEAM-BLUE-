package com.page.object.model;





//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement cookies;
	
	
	@FindBy(xpath = "//*[@data-ga-label='user account>sign in']")
	private WebElement signin;
	
	@FindBy(xpath = "//*[@id='signin_email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='signin_password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id='signin_submit']")
	private WebElement finalsignin;
	
	//@FindBy(xpath = "(//*[@data-testid='header-primarynav-link'])[1]")
	//private WebElement forsale;
	
		
	//@FindBy(xpath = "//*[@class='row-even browse-row-clickable']")
	//private List<WebElement> tablerows;
	
	
	public WebElement getCookies() {
		return cookies;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getFinalsignin() {
		return finalsignin;
	}
	
	
	//public WebElement getForsale() {
	//	return forsale;
	//}
	//public List<WebElement> getTablerows() {
	//		return tablerows;
	//}
	
	
}
