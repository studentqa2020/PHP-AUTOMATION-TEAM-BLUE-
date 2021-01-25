package com.Collection.Practice;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
//Age = 40,salary = 5000;same type of data

	public static void main(String[] args) {

		Map<String, Integer> mymap = new HashMap<>();
		mymap.put("Age", 40);
		mymap.put("Salary", 5000);

		/*
		 * System.out.println(mymap); 
		 * System.out.println(mymap.size());
		 * System.out.println(mymap.keySet());//only key
		 * System.out.println(mymap.values());//only value
		 * System.out.println(mymap.entrySet());
		 * 
		 * //Advance for loop for(Map.Entry<String,Integer> i:mymap.entrySet()) {
		 * System.out.println(i.getKey() +"===="+ i.getValue()); } 
		 * //key loopling
		 * for(String k :mymap.keySet()) { System.out.println(k); } 
		 * //value looping
		 * for(int v:mymap.values()) { System.out.println(v); }
		 */
		
		mymap.forEach((k,v)->{
			if(k.contains("Salary")) {//contains is for String.
			System.out.println(k+"=="+v);
			}
			if(v==5000) {
			System.out.println(k+"=="+v);//int we have to use ==	
			}
		});
		
		//stream API + forEach
		mymap.entrySet().stream().forEach(values ->{
			System.out.println(values.getKey() + "=="+values.getValue());
		});
		//filtering
		//old java=> if else, ternary, case statement
		//new java => filter
		mymap.entrySet().stream().filter(v->v.getKey().contains("Age")).forEach(values ->{
			System.out.println("Looking for Age only="+values.getKey() + "=="+values.getValue());
		});
	}
}