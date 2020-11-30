package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BoseConfig {

	public static  String getConfigValue(String value) throws Throwable{
		
		String filepath = "./Config.Properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		Properties pro = new Properties();
				pro.load(fis);
		
		return pro.getProperty(value);
	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println(BoseConfig.getConfigValue("url"));
		System.out.println(BoseConfig.getConfigValue("firstname"));
		System.out.println(BoseConfig.getConfigValue("lastname"));
		System.out.println(BoseConfig.getConfigValue("mobilenumber"));
		System.out.println(BoseConfig.getConfigValue("email"));
		System.out.println(BoseConfig.getConfigValue("password"));
		
	}
	
}
