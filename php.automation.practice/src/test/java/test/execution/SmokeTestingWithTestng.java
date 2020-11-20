package test.execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;



public class SmokeTestingWithTestng {

	WebDriver driver;
	
	@BeforeTest
	public void getDriverSetup() throws Throwable{
		driver=  BaseLogin.getDriverManager();
	}
	
		
	@Test
	
	public void getsalary() throws Throwable{
		driver = BaseLogin.getLogin(driver);
	}
	
	@AfterTest
	public void getDriverClose(){
		driver.quit();
	}
}
