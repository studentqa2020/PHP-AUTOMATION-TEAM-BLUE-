package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactory;
import com.util.BoseConfig;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class phpLoginAutomationCodng {

	WebDriver driver;
	MasterPageFactory pf;
	
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();   
	      
	    
	}

	@When("Send URL")
	public void send_URL() throws Throwable {
		driver.get(BoseConfig.getConfigValue("url"));  
	    
	}
	@When("Click My Account")
	public void click_My_Account() {
		pf = new MasterPageFactory(driver);
		pf.getMyAccount().click(); 
	   
	}
	
	@When("Click SignUp btn")
	public void click_SignUp_btn() {
		pf.getSignUp().click();
	}

	@When("Send valid firstname")
	public void send_valid_firstname() throws Throwable {
		pf.getFirstName().sendKeys(BoseConfig.getConfigValue("firstname"));
 
	    
	}

	@When("Send valid lastname")
	public void send_valid_lastname() throws Throwable {
		pf.getLastName().sendKeys(BoseConfig.getConfigValue("lastname"));   
	    
	}

	@When("Send valid mobilenumber")
	public void send_valid_mobilenumber() throws Throwable {
		pf.getMobileNumber().sendKeys(BoseConfig.getConfigValue("mobilenumber")); 
	    
	}

	
	/*
	 * @When("Send valid email") public void send_valid_email() throws Throwable {
	 * pf.getEmail().sendKeys(BoseConfig.getConfigValue("email"));
	 */
	@When ("Send valid email {string}")
	public void SendValidEmail(String user) {
		pf.getEmail().sendKeys(user);
	}
	
	/*
	 * @When("Send valid password ") public void send_valid_password() throws
	 * Throwable { pf.getPassword().sendKeys(BoseConfig.getConfigValue("password"));
	 */
	@When("Send valid password {string}")
	public void SendValidPassword(String password) {
	}
	
	@When("Send valid confirmPassword")
	public void send_valid_confirmPassword() throws Throwable {
		pf.getConfirmPassword().get(5).sendKeys(BoseConfig.getConfigValue("password"));   
	    
	}
	@When("Click submit btn")
	public void click_submit_btn() {
		pf.getFinalSignUp().submit();  
	    
	}

	@Then("Validate login success or fail")
	public void validate_login_success_or_fail() {
	    
	    
	}
	@When("Close browser")
	public void close_browser() {
	    driver.quit();
	   
	}
	}
	






