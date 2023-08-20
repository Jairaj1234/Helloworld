package javaer.java;

public class isRepeit {
	static int isrepit(int[] x,int ele) {
		int pos=-1;
		for(int i=0;i<x.length;i++) {
			if(ele==x[i]) {
				pos=i;
			}
		}
		return pos;
	}

}
