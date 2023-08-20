package javaer.java;


import java.util.Scanner;
public class Per {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter all values");
		int p=sc.nextInt();
		
		int c=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int per=p*c*m*b/4;
		
		
			if(per>85) {
				System.out.println("distinction");
			}
				else if(per>60 && per<=85) {
					System.out.println("first class");
				}
				else if(per>50 && per<60) {
					System.out.println("second class");
					
				}
				else {
					System.out.println("third class");
				}
					
				}
				
		
	
}
