package javaer.java;
import java.util.Scanner;
public class Dectobin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          sc.close();
          String rs=binary(n);
          
        	  System.out.println(rs);
          
          
        	  
          
	}
	static String binary(int x) {
		String sum=" ";
		do {
			int d=x%2;
			sum=d+sum;
			x=x/2;
		}while(x!=0);
		return sum;
		
	}

}
