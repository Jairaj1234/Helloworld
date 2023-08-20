package javaer.java;
import java.util.Scanner;
public class Spy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean rs=Spynumber(n);
		if(rs)
			System.out.println("no is spy no");
		else
			System.out.println("no is not a spy number");

	}
	static boolean Spynumber(int x) {
		int ps=0,sum=1;
		do {
			int d=x%10;
			ps=ps+d;
			sum=sum*d;
			x=x/10;
		}while(x!=0);
		return(ps==sum);
		
	}
	
	
}
