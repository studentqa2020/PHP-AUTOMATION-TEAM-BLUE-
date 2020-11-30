package com.practice.java;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingJavaMainWithTestNG {

	public static void main(String[] args) {
		
	}
	
	@Test
	@Parameters (value = "Browser")
	public void getTest(String name){
		System.out.println(name);
	}
	
}