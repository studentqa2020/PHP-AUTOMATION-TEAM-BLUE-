package com.abstractclass;

public abstract class AbstractClass {

	public abstract void getA();

	public void getB() {
		System.out.println("B");
	}

	
	/*
	 * public static void main(String[] args) { System.out.println("main"); }
	 */
	 
}

  class Tech extends AbstractClass{

	@Override
	public void getA() {
	System.out.println("Smart tech is a great school");
	}
	}
  
   class School{
	 public static void main(String[] args) {
		 Tech obj = new Tech();
		obj.getA();
		obj.getB();
	}
 }
