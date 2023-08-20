package javaer.java;
import java.util.Scanner;
 class PallindromeNUmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n");
		int n=sc.nextInt();
		sc.close();
		
		boolean rs=isPallindrome(n);
		if(rs)
			System.out.println("no is pallindrome number");
		else
			System.out.println("no is a not a pallindome number");
		
	}
	static boolean isPallindrome(int x) {
		int rev=0; int temp=x;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
	}while(x!=0);
	return (rev==temp);	
}}
   