package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
public static void getcolor(WebDriver driver, WebElement element){
	
	((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
	
}

public static void getcolor(WebDriver driver, WebElement element,String color) {
	
	((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid "+color+"'", element);
	
}
}
