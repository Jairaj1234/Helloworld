package javaer.java;

import java.util.Scanner;

class PerfectNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int m=sc.nextInt();
	int n=sc.nextInt();
	sc.close();
	for(int i=m;i<=n;i++)
	{
		if(isSpy(i))
		{
			   System.out.println(i+" ");
			   
			
		}
		}
	}

	static boolean isSpy(int x) {
		 
			int sum = 0,prod=1;
			do {
				int d = x % 10;
				sum = sum + d ;
				prod =prod *d;
				x = x / 10;
			} while (x != 0);
			
		
		return sum==prod;
	}
}
