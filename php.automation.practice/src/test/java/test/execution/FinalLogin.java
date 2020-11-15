package test.execution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class FinalLogin {

	
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = BaseLogin.getLogin();
		
		Thread.sleep(2000);
		driver.quit();
				
	}
}
