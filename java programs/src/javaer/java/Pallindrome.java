package javaer.java;

public class Pallindrome {
	static int isPallindrome(int[] x) {
		int rev = 0;
		int temp;
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			temp = x[i];
			do {

				int d = x[i] % 10;
				rev = rev * 10 + d;
				x[i] = x[i] / 10;
			} while (x[i] != 0);
			if (temp == rev) {
				count++;
				rev=0;
			}
		}
		return count;

	}

}
