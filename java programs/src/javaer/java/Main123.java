package javaer.java;

public class Main123 {

	public static void main(String[] args) {
		ArrayOperation1 az=new ArrayOperation1();
		
		int[] x=az.readArray();
		int[] y=az.readArray1();
		Merge m=new Merge();
		int[]  z=m.isMerge(x,y);
		az.display(z);
		
		System.out.println(z);

	}
	

}
