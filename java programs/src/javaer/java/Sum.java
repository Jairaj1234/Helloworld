package javaer.java;

public class Sum {
     void sumBy(int[] ar) {
    	 for(int i=0;i<ar.length;i++) {
    		 ar[i]=sumofdigits(ar[i]);
    	 }
     }
     int sumofdigits(int x) {
    	 int sum=0; 
    	do { sum=sum+x%10;
    	 x=x/10;
     }while(x!=0);
     return sum;
     }
     
}
