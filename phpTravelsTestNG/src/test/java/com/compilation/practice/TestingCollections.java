package com.compilation.practice;

import java.util.Arrays;

public class TestingCollections {

	
	  static int[] a = {10,20,30,40}; //@Factory use [] dimensional array
	  //static int [][] b = {{1,2,3},{4,5,6}}; // @Dataprovider use [][] dimensional array
	  				
	  public static void main(String[] args) {
		  System.out.println(Arrays.toString(a));
		  System.out.println(a.length); // how to know array object number?
		  System.out.println(a[1]);//index theory
	  
		/*loop--> for(start point;end point;++/--)
		 * for(int i=0;i<a.length;i++)
		 * { System.out.println(a[i]); }
		 */
		  //advance loop-->for(dataType anyName : ArrayName){}
		  /* for(int value:a) {
		 System.out.println(value);
		 */
		  //Stream is a JAVA API
		  // -> is lambda sign. similar like method
		  // Arrays.stream(a).forEach(value -> System.out.println(value));
		  Arrays.stream(a).forEach(abu -> System.out.println(abu));
		  //stream = java api
		  //-> = similar like method
	 }
	
	/*static int[]a = {2,3,4,5,6};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(a[4]);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
	 //for(int x:a){
	 //System.out.println(x);
	 // Arrays.stream(a).forEach(x -> System.out.println(a));
	}

