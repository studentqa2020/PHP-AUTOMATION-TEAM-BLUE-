package com.compilation.practice;

import java.util.Arrays;

public class ArrayCodingTest {

	static int[] a = {2,3,4,5,6,7,8,9};
	static int[] b = {2,3,4,5,6,7,8,9};
	static int[] c = {2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		Arrays.stream(a).forEach(v -> System.out.println(v));
		//max
		int maxValue = Arrays.stream(a).max().getAsInt();
		System.out.println("Arrays Max Value = " +maxValue);
		
		//min
		int minValue = Arrays.stream(a).min().getAsInt();
		System.out.println("Arrays Min Value = " +minValue);
		
		//2nd max value
		int SecondndMaxValue = Arrays.stream(a).filter(v -> v<maxValue).max().getAsInt();
		System.out.println("Arrays 2nd max value = " +SecondndMaxValue);
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		
		for(int g:b) {
		System.out.println(g);
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(c.length);
		
		for(int i=0; i<c.length; i++) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(c.length);
		
		for(int j =c.length-1; j>0; j--) {
			System.out.println(j);
		}
	
	}
}
