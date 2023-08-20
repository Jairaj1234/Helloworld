package javaer.java;
import java.util.Scanner;
public class Xylem {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the value of n :");
    	int n=sc.nextInt();
    	sc.close();
    	//xylem number-sum of first number and last number is equal to the middle number
    	boolean rs=isXylem(n) ;
    			if(rs) {
    				System.out.println("no is a Xylem number");
    			}
    			else
    				System.out.println("no is phloem number");
    			
    }
    static boolean isXylem(int x) {
    	int es=0,ms=0,temp=x;
    	do {
    		int d=x%10;
    		if(x==temp ||x==d) {
    			es=es+d;
    		}
    			else {
    				ms=ms+d;
    			}
    		x=x/10;
    		} while(x!=0);
    	
    	return (ms==es);
    	 }
    
    
}

