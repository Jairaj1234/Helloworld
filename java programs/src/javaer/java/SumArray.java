package javaer.java;

import java.util.Scanner;

public class SumArray {

	int[] readArray () {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter "+n+" "+"values");
		for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
			
		}
		return ar;
	}
	void display(int[] ar) {
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]);
		}
		
	}
	int array(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
		    for (int j = 2; j < ar[i]; j++) {
		        if (ar[i] % j == 0) {
		            count++;
		            break;  // Break out of the loop once we find a divisor
		        }
		    }
		}
		return count;

	}}
	
			
		
	
			
			
	
	
	
	
	

	


