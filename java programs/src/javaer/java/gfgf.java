package javaer.java;

import java.util.Scanner;

class gfgf{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=100;i++)
	{
		if(isHappy(i))
		{
			   System.out.println(i+" ");
			   
			
		}
		}
	}

	static boolean isHappy(int x) {
		while (x > 9) {
			int sum = 0;
			do {
				int d = x % 10;
				sum = sum + d * d;
				x = x / 10;
			} while (x != 0);
			x = sum;
		}
		return x == 1 || x == 7;
	}
}
package javaer.java;

public class gfgf {

}
