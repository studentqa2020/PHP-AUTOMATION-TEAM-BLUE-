package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTesting {

	public void getCheckedException() {
		
		try {
			
			  Thread.sleep(3000); 
			  FileInputStream fis = new FileInputStream("file");
			 
			System.out.println(1/0);
		} catch (Exception e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("12");
		}
		finally{
		System.exit(0);
			System.out.println("hi");
		}
		
		
		
		/*
		 * try { Thread.sleep(2000);
		 * FileInputStream fis = new FileInputStream("file");
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * //e.printStackTrace(); }
		 */
	//}
	/*
	 * public void getUncheckedException() { 
	 * try { System.out.println(1/0); }
	 * //catch (Exception e) { //e.printStackTrace(); //} 
	 * finally {
	 * //System.exit(1); 
	 * System.out.println("hi"); } }
	 */
	}
}

