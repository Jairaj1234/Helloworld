package javaproject1;

import java.util.Scanner;
class MainStrong {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	sc.close();
	boolean rs=isStrong(n);
	if(rs)
		System.out.println(n+"is a strong number");
	else 
		System.out.println(n+"is not a strongv number");

	}
	static boolean isStrong(int x)
	{
	 {	int sum=0 ,temp=0;
	do {	int d=x%10;
		sum=sum+fact(d);
       x=x/10;

	}while(x!=0);
	if(sum==temp)
		return true;
	else 
		return false;
}}
static int fact(int n)
{
	int fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}}
