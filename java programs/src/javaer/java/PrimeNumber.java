package javaer.java;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			boolean a=Prime(i);
			if(a) {
				System.out.println(i);
				
			}
			
			
		}
	}
        static boolean Prime(int x) {
        	for(int i=2;i<=x/2;i++) {
        		if(x%i==0) {
        			return false;
        			
        		}
        		
        	}
        	return true;
	}

}
