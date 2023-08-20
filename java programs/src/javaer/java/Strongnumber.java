//program for Strong numbers upto n
package javaer.java;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<n;i++) {
		boolean wes=isStrong(i); 
		if(wes)
			System.out.println(i);
		}}
			
		static boolean isStrong(int x) {
		
			
			int sum=0; int a=x;
			do {
				int d=x%10;
				sum=sum+fact(d);
				x=x/10;
			}while(x!=0);
		if(sum==a) {
			return true;
		}
		else {
			return false;
		}
		}
		
		
	
            static int fact(int x) {
            	int fact=1;
            	for(int i=1;i<=x;i++) {
            		fact=fact*i;
            	}
            	return fact;
            }

}
