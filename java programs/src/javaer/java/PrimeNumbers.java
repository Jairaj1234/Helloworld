package javaer.java;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sc.close();
		
		boolean rs=isPrime(n);
		if(rs) {
			System.out.println(n+"is prime number");
		}
			else {
				System.out.println(n+"is not a prime number");
			}
	}
			static boolean isPrime(int x) {
				for(int i=2;i<=x/2;i++) {
					if(x%i==0) 
						return false;
				}
				return true;
			}
				
				
			
		}

	


