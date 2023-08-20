package javaer.java;
import java.util.Scanner;
public class Ishappy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int count=0;
		for (int i = 1; i <=n; i++) {
			boolean rs = isHappy(i);
			if (rs)
				count++;
				

		}
		System.out.println(count);

	}
 static boolean isHappy(int x) {
	 while(x>9) {
	int	sum=0; 
		 do {
			 int d=x%10;
			 sum=sum+d*d;
			 x=x/10;
			 }while(x!=0);
		 x=sum;
	 }
	 return x==7 || x==1;
	 
		 
	 }
 
	 
		 
 }
 

