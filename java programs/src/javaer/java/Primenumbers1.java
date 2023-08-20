//program to check prime numbers upto 1 to n
package javaer.java;
import java.util.Scanner;
public class Primenumbers1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m and n value:  ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		
		sc.close();
		 int count=0;
        for(int i=m;i<n;i++) {
		boolean rs=isPrime(i);
       
		if(rs) {
			System.out.println(i+"");
			
		
		}
		
        }
        }
			
		static boolean isPrime(int x) {
			for(int i=2;i<x/2;i++) {
			if(x%i==0) 
				return false;
			}
			return true;
		
	}

}
