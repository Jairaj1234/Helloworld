package javaer.java;

public class Merge {
        int[] isMerge(int[] ar,int[] br) {
        	int[] cr=new int[ar.length+br.length];
        	for(int i=0;i<ar.length;i++) {
        	cr[i]=ar[i];
        	}
        	for(int i=0;i<br.length;i++) {
        		cr[ar.length+i]=br[i];
        	}
        	return cr;
}}
