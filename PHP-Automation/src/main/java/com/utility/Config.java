package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	

	public static String getConfig(String value) throws Throwable{
		
		String path = "./Config";
		FileInputStream fs = new FileInputStream(path);
				
		Properties obj = new Properties ();
		obj.load(fs);
		
		return obj.getProperty(value);
		
	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println(Config.getConfig("URL"));
		System.out.println(Config.getConfig("Email"));
		System.out.println(Config.getConfig("Password"));
	}
}
