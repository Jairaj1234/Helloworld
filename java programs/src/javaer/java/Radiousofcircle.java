package javaer.java;
import java.util.Scanner;
public class Radiousofcircle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radious : ");
		double radious=sc.nextDouble();
		sc.close();
		double area=3.143*radious*radious;
		double circumference=2*3.143*radious;
		System.out.println("area of circle =" +area );
		System.out.println("circumference of circle="+circumference);
				
		

	}

}
