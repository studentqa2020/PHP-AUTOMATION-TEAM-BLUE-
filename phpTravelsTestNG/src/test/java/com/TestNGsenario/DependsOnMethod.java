package com.TestNGsenario;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(dependsOnMethods = {"BrowserOpen"})
	public void  BrowserClose() {
		
		System.out.println("2");
	}
	
	@Test
	public void BrowserOpen() {
		
		System.out.println("1");
	}
	
	
	
}
