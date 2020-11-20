package com.java.condition.practice;

public class TestingJavaCondition {

	public void getsalary() {
		int age = 70;
		
		if(age>21) {// true
			System.out.println("adult");
		}else {//false
			System.out.println("age in not in my range");
		}
	}
	
	public static void main(String[] args) {
		TestingJavaCondition obj = new TestingJavaCondition();
		obj.getsalary();
	}
}
//else if (age>65) {
			//System.out.println("senior citizen");