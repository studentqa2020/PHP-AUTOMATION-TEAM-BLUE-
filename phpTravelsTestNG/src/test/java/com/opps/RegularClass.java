package com.opps;

public class RegularClass implements Child {

public static void main(String[] args) {
	
	RegularClass obj = new RegularClass();
	obj.getA(10);
	obj.getB(20);
	obj.getC(30);
	System.out.println("a");
	System.out.println("b");
	System.out.println("c");
}

@Override
public void getB(int b) {
	// TODO Auto-generated method stub
}

@Override
public void getA(int a) {
	// TODO Auto-generated method stub
}

@Override
public void getC(int c) {
	// TODO Auto-generated method stub
}
}

