package javaer.java;
import java.util.Scanner;
public class ArrayOperation {

	int[] readArray() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=sc.nextInt();
	int[] ar=new int[n];
	
	
	
		System.out.println("enter" +n +"values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}

		return ar;
	}
	void display(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
	}
	boolean sum(int[] ar) {
		int small=ar[0];
		for(int i=1;i<ar.length-1;i++) {
			if(ar[i]<small)
				small=ar[i];
	}
	
}
}
