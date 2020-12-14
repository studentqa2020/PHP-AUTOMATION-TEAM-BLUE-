package com.TestNGsenario;

import org.testng.annotations.Test;

public class Enable {

	@Test
	void get1(){
	System.out.println("1");	
	}
	
	@Test
	void get2(){
	System.out.println("2");	
	}
	@Test
	void get3(){
	System.out.println("3");	
	}
	@Test(enabled = false)
	void get4(){
	System.out.println("4");
	}
	@Test(enabled = false)
	void get5(){
	System.out.println("5");	
	}
	@Test(enabled = true)	
	void get6(){
	System.out.println("6");	
	}
	@Test(enabled = false)
	void get7(){
	System.out.println("7");	
	}
}
