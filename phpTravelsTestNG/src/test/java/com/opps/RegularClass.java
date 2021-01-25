package com.opps;

public class RegularClass implements Child {

public static void main(String[] args) {
	
	//RegularClass obj = new RegularClass();
	Child obj = new RegularClass();
	obj.getA();
	obj.getB();
	obj.getC();

}

@Override
public void getB() {
	System.out.println("a=100"+(a+b));
}

@Override
public void getA() {
	System.out.println("b=200"+(b*c));
}

@Override
public void getC() {
	System.out.println("c=300"+(c/a));
}
}

