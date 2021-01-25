package com.compilation.practice;

public class ArrayPractice {
	//static int[] a = { 99, 45, 32, 58, 92 };
	static int [] b = {30,10,50,80,90,70};

	public static void main(String[] args) {
		/*
		 * System.out.println(Arrays.toString(a)); System.out.println(a[1]);
		 * System.out.println(a.length);
		 */

		/*
		 * for(int i = 0;i<a.length;i++) { System.out.println(a[i]); }
		 * 
		 * for (int i=a.length-1;i>=0;i--) { //for(end point-1;start;--)
		 * System.out.println(a[i]); }
		 */

		// max number
		// int MaxNumber = a[0];
		/*
		 * int MaxNumber = 0; System.out.println("Initial Max Number=" + MaxNumber); for
		 * (int i = 0; i < a.length; i++) { if (a[i] > MaxNumber) { //
		 * System.out.println(a[i]); MaxNumber = a[i];
		 * System.out.println("Max Number inside loop=" + MaxNumber);
		 * 
		 * } } System.out.println("This is my Max Number= " + MaxNumber);
		 * 
		 * int MinNumber = 100; System.out.println("Initial Value=" + MinNumber);
		 * 
		 * for (int j = a.length - 1; j >= 0; j--) { if (a[j] < MinNumber) { MinNumber =
		 * a[j]; System.out.println("Min Number inside loop= " + MinNumber); } }
		 * System.out.println("This is My Min number=" + MinNumber);
		 */
		int MinNumber1 = 20;
		//for (int k = 0; k >=b.length; k++) {
		for(int k=b.length-1;k>=0;k--) {
			//if (MinNumber > b[k]) {
			if(b[k]<MinNumber1) {
				MinNumber1 = b[k];
				System.out.println("Min Number inside loop= " + MinNumber1);
			}
		}
		System.out.println("This is My Min number=" + MinNumber1);
		/*
		 * for(int x:a) { System.out.println(x); }
		 */
	}
}
