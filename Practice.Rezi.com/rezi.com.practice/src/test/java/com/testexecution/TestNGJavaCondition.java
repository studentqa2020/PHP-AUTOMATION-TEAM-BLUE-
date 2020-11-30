package com.testexecution;

public class TestNGJavaCondition {

	//and = &&, or = ||, equal == , not equal !=
	int age = 67;
	public  void getage() {
		
		if (age > 21 && age >65) {
			System.out.println("Adult + Senior Citizen");
		}else {
			System.out.println("Not Adult");
		}		
	}
	public static void main(String[] args) {
		TestNGJavaCondition obj = new TestNGJavaCondition();
		obj.getage();
	}
}
