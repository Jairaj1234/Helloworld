package javaer.java;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int c=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int per=p*c*m*b/4;
		if(p<35 || b<35 || c<35 || m<35) 
			System.out.println("fail");
		
			else if(per>85) {
				System.out.println("distinction");
			}
				else if(per>60 && per<=85) {
					System.out.println("first class");
				}
					else (per=>50 && per<=60) {
						System.out.println("Second class"); 
					}
					else( per>=35 &&  per<50) {
						System.out.println("third class");
					}
					
				}
				
		
	
}
