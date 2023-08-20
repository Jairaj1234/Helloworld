package javaer.java;

import java.util.Scanner;

public class ArrayOperation1 {
    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int[] readArray1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] br = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < br.length; i++) {
            br[i] = sc.nextInt();
        }
        return br;
    }

    void display(int[] x) {
    	int i=0;
        for ( i = 0; i < x.length; i++) {
        	
        }
        System.out.println("Updated array is " + x[i]);
    }
    int big=getBiggest1(n);
}
