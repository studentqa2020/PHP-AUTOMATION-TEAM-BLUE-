package com.java.condition.practice;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class ReviewClassPractice {
		//String browser="chrome";
		@Test
		@Parameters(value="browser")
		
		public void getsalary(String browser){

			if(browser.contains("chrome")) {//false
				System.out.println(" found my chrome browser");
				
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//FB
				//driver.get("https://www.facebook.com/");
				driver.navigate().to("https://www.facebook.com/");
				
			}else if(browser.contains("Safari")) {//false
				System.out.println(" found my safari browser");
				
				System.setProperty("webdriver.safari.driver", "Path");
				WebDriver driver = new SafariDriver();
				driver.manage().window().maximize();
				//FB
				//driver.get("https://www.facebook.com/");
				driver.navigate().to("https://www.facebook.com/");
			}else if(browser.contains("ie")) {//true
				System.out.println(" found my ie browser");
				
				System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				//FB
				//driver.get("https://www.facebook.com/");
				driver.navigate().to("https://www.google.com/");
			}else {//run
				System.out.println("Browser not found ");
			}
			
		}
	}		
		


	



