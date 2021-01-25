package com.Collection.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

	public static void main(String[] args) {
	//2,3,2,6,3,5 remove duplicate
	
	  Set<Integer> myhashset = new HashSet<>();//allow null 
	  myhashset.add(2);
	  myhashset.add(3); 
	  myhashset.add(2); 
	  myhashset.add(6); 
	  myhashset.add(3);
	  myhashset.add(5);
	  
	  System.out.println("My HashSet="+myhashset);//no order
	  
	  Set<Integer> mylinkhashset = new LinkedHashSet<>();//allow null
	  mylinkhashset.add(3);
	  mylinkhashset.add(2); 
	  mylinkhashset.add(5);
	  mylinkhashset.add(1);
	  
	  System.out.println("My Link Hash Set="+mylinkhashset);//insertion
	 
//2,3,2,6,3,5 remove duplicate and ascending order
Set<Integer> mytreeset = new TreeSet<>();//don't allow null
mytreeset.add(2);
mytreeset.add(3);
mytreeset.add(2);
mytreeset.add(6);
mytreeset.add(3);
mytreeset.add(5);
System.out.println("My Tree Set="+mytreeset);//ascending

List<Integer> arraylist = new ArrayList<>();
arraylist.addAll(mytreeset);
Collections.reverse(arraylist);
System.out.println("Reverse My Tree Set="+arraylist);

int MaxValue = Collections.max(arraylist);
System.out.println("My Max List Value="+MaxValue);

int MinValue = Collections.min(arraylist);
System.out.println("My Min List Value="+MinValue);

}
}