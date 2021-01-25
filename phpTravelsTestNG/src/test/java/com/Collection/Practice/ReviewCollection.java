package com.Collection.Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReviewCollection {
 //2,3,4 => array,list,set then print
	//array
	
	public static void main(String[] args) {
		
	
	 //int [] a= {2,3,4}; 
	String[] b= {"Poly,Afifa,Susmita"};
	/*
	 * System.out.println(Arrays.toString(a)); 
	 * System.out.println(a.length);
	 */
	System.out.println(Arrays.toString(b));
	
	//List
	//List<Integer> myArraylist = new ArrayList<>();
	/*List<Integer> myLinkedlist = new LinkedList<>();
	List<Integer> vector = new Vector<>();*/
	List<String> myArraylist = new ArrayList<>();
	
			myArraylist.add("Poly");
			myArraylist.add("Afifa");
			myArraylist.add("Susmita");
			System.out.println("My list Value="+myArraylist);
			
	//Set
			//Set<Integer> hashset = new HashSet<>();	
			Set<String> hashset = new HashSet<>();
			
			hashset.add("Poly");
			hashset.add("Afifa");
			hashset.add("Susmita");
			System.out.println("My Set Value="+hashset);
			
			
	

	
	
}	
}
