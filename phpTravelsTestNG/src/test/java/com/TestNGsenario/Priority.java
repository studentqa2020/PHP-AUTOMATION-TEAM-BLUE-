package com.TestNGsenario;

import org.testng.annotations.Test;

public class Priority {

	
	@Test (priority =1)//index theory 1 = 2
	public void BrowserClose(){
		
	}
	
	
	@Test(priority = 0)//index theory 0 = 1
	public void BrowserOpen(){
		
	}
}
