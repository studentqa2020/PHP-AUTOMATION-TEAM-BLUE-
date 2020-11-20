package test.execution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class SmokeTesting {

	
	static WebDriver driver;
	public static void main(String[] args ) throws Throwable {
		
		driver = BaseLogin.getDriverManage();
		driver = BaseLogin.getLogin(driver);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
