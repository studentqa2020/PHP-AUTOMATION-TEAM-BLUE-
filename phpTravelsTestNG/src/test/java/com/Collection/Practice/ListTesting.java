package com.Collection.Practice;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTesting {

	static List<Integer> arraylist = new ArrayList<>();
	List<Double> b = new LinkedList<>();
	List<String> c = new Vector<>();
	List<Boolean> d = new Stack<>();
	
	//List data type should be wrapper class/non-primitive data= String,Double,Integer,Boolean
public static void main(String[] args) {
	arraylist.add(2);
	arraylist.add(4);
	arraylist.add(6);
	arraylist.add(8);
	arraylist.add(9);
	System.out.println("List value="+arraylist);
	arraylist.remove(2);
	System.out.println("List after removing="+arraylist);
	System.out.println(arraylist.size());
	
	Collections.reverse(arraylist);
	
	int MaxValue = Collections.max(arraylist);
	System.out.println("My Max List Value="+MaxValue);
	
	int MinValue = Collections.min(arraylist);
	System.out.println("My Min List Value="+MinValue);
	
}

}
