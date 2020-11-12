package Zoopla.com.utility;

import java.io.FileInputStream;

import java.util.Properties;

public class Config {

	public static String getconfig(String value) throws Throwable {
		
		String path = "./Config.properties";
		FileInputStream fs = new FileInputStream(path);
		
		Properties obj = new Properties();
		obj.load(fs);
		
		return obj.getProperty(value);
		
	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println(Config.getconfig("URL"));
		System.out.println(Config.getconfig("Email"));
		System.out.println(Config.getconfig("Password"));
	}
}
