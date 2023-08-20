package javaer.java;
import java.util.Scanner;

public class HappyNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value:");
		int m=sc.nextInt();
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		sc.close();
		for(int i=m;i<=n;i++) {
			boolean rs=isHappy(i);
			if(rs)
				System.out.println(i);
			
		}
	}
	static boolean isHappy(int x) {
		while(x>9) {
			int sum=0;
		
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
				
			}while(x!=0);
	        
			sum=x;
			
		}
		return x==7 ||x==1;
		
		

}
}