package com.TestNGsenario;

public class InfiniteLooping {

	public static void main(String[] args) {
		
	
	for (int i = 0; i < 10000; i++) {
		  if (i == 400) {
		    break;
		  }
		  System.out.println(i);
		}
}
}