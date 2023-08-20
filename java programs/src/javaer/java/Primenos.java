package javaer.java;

public class Primenos {
          static int Prime(int[] x) {
        	  int count=0;
        	  for(int i=0;i<x.length;i++) {
        		  if(x[i]%2!=0) {
        			  count++;
        		  }
        		  
        	  }
        	  return count;
          }
}
