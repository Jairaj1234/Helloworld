package javaer.java;
import java.util.Scanner;
public class DesiriumNumer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sc.close();
		
		
		int rs=isDesirium(n);
		if(rs==n)
			System.out.println(n);
		
	
		

	}
	static int isDesirium(int x) {
		int sum=0;
		do {
			int d=x%10;
			sum=sum+pow(d,count(x));
			x=x/10;
		
	}while(x!=0);
	
		return sum;
	}
	

	


		
		static int count(int x) {
		int count=0;
		do {
			count++;
			x=x/10;
		}while(x!=0);
		return count;
	}
	static int pow(int m,int n) {
	int fact=1;
	for(int i=1;i<n;i++) {
		fact=fact*m;
	}
	
	return fact;
	}
}
