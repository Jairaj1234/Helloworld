package javaer.java;

import java.util.Scanner;
class PerfectNo {
	public static void main(String[] args ){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
	
                  boolean rs=isPerfectNO(n);
                  if(rs) {
                  	System.out.println(n+"no is perfect  no");
                  }
                  else {
                  	System.out.println(n+"is not a perfect no");
	}
}
	static boolean isPerfectNO(int x) {
		do{
			int d=x%10;
			int sum=sum+perfect(d);
			x=x/2;
			if(sum==x) {
				return true;
			}while(x!=0);

			
			return false;

		
		}static int perfect(int y) {
			
		}
		}


	
	