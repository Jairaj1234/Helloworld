package javaer.java;
import java.util.Scanner;
public class Desirium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
             int n=sc.nextInt();
             sc.close();
          int count=0;
             for(int i=1;i<n;i++) {
            	  int rs=isDesirium(i);
             
             if(rs!=0)
        count++;
            
            	 
	}
             System.out.println(count);
             }
            	 static int isDesirium(int x) {
            		 int sum=0 ;
					 int a=x;
            		 do {
            			 
            			 int d=x%10;
            			 sum=sum+pow(d,iscount(x));
            			 x=x/10;
            		 }while(x!=0);
            		 if(sum==a)
            			 return a;
            		 else
            			 return 0;
            	 }
            		 static int iscount(int n) {
            			 int count=0;
            			 do {
            				 
            				 count++;
            				 n=n/10;
            			 }while(n!=0);
            			 return count;
            		 }
            			 static int pow(int x,int y)
            			 {
            				 int fact=1;
            			 
            			 for(int i=1;i<=y;i++) {
            				 fact=fact*x;
            				 
            			 }
            			 return fact;
            			 }            		 
            			 
}        		 
            		 
            	 
             
	


