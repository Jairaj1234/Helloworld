//java program to check no is perfect number or not
package javaer.java;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sc.close();
		 int rs=isPerfect(n);
		if(rs==n) {
			System.out.println("no is perfect no");
		}
			else{ 
				System.out.println("no is not a perfect no");
	}}
	static int isPerfect(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				sum=sum+i;
		
			}
			}
			return sum;
			}
		}



