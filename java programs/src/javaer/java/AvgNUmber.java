package javaer.java;
import java.util.Scanner;
public class AvgNUmber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n=sc.nextInt();
		System.out.println("enter second umber");
		
		int a=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		System.out.println("enter the fourth number");
		int d=sc.nextInt();
		int avg=a+n+c+d/4;			
	System.out.println(avg);
	}
	

}
