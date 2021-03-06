package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	public static String getConfigValue(String value) throws Throwable{
		
		
		String filepath = "./config.properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		
		return pro.getProperty(value);
	}

public static void main(String[] args) throws Throwable {
	System.out.println(BaseConfig.getConfigValue("url"));
	System.out.println(BaseConfig.getConfigValue("email"));
	System.out.println(BaseConfig.getConfigValue("password"));
}
}
