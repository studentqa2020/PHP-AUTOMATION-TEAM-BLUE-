package com.TestNGsenario;

import org.testng.annotations.Test;

public class DependsOnMethod {

	/*
	 * @Test(dependsOnMethods = {"BrowserOpen"}) public void BrowserClose() {
	 * 
	 * System.out.println("2"); }
	 * 
	 * @Test public void BrowserOpen() {
	 * 
	 * System.out.println("1"); }
	 */
	
	@Test(dependsOnMethods = {"get3"})
	void get1() {
		System.out.println("Depends on 3");
	}
	
	
	@Test(dependsOnMethods = {"get1"})
	void get2(){
		System.out.println("Depends on 1");
	}
	@Test
	void get3(){
	System.out.println("not depends on any");	
	}
}
