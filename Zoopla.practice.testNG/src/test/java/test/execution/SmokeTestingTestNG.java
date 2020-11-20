package test.execution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.generic.code.BaseLogin;

public class SmokeTestingTestNG {

	WebDriver driver;
	
	@BeforeTest
	public void getDriverSetup() throws Throwable {
	driver = BaseLogin.getDriverManage();
	}
	
	@Test
	public void getTest() throws Throwable{
	driver = BaseLogin.getLogin(driver);
	}
	
	@AfterTest
	public void getAfterTest() throws Throwable{
	Thread.sleep(3000);
		driver.quit();
	}
}
