package com.Collection.Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayTestingPractice {

	//mylist ,int
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		System.out.println(mylist);
		
		//basic loop
		for(int i = 0; i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}	
		//enhance loop for (dataType anyName:Collection){}
		for (int x:mylist) {
			System.out.println("Enhance for loop="+x);
		}
		//for each 
		mylist.forEach(a -> System.out.println("For each loop="+a));
	}
}
