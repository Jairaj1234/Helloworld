package javaer.java;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
         int num=sc.nextInt();
         if(num/2*2==num) {
        	 System.out.println(num+ "is  even number");
         }
        	 else {
        		 System.out.println(num+"is a odd number");
         }}
	}


