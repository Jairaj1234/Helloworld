package javaer.java;

public class getBiggest {

	static int getBiggest1(int[] ar) {
		int small=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
		}
	}

