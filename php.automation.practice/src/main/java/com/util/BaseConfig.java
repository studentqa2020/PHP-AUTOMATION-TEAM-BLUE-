package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	public static   String getConfigValue(String value) throws Throwable{
		
		String filepath = "./Config.properties";
		FileInputStream fis = new FileInputStream(filepath);
		
			Properties pro = new Properties();
			pro.load(fis);
		
			
			return pro.getProperty(value);
		
	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println(BaseConfig.getConfigValue("URL"));
		System.out.println(BaseConfig.getConfigValue("Email"));
		System.out.println(BaseConfig.getConfigValue("Password"));
	}
}
