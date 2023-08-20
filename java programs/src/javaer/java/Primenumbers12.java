//counting prime numbers within n
package javaer.java;
import java.util.Scanner;
public class Primenumbers12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
		int rs=isPrime(i);
		if(rs==i) {
			System.out.println(i);
		}
		}
	}
	static int isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return 0; }
			}
		
		return x;
	}

}
