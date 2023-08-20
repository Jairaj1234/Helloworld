package javaer.java;



import java.util.Scanner;
class MainStrong {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	sc.close();
	for(int i=1;i<n;i++) {
	int r=isStrong(i);
	if(r==i)
		System.out.println(i);
	

	}}
	static int isStrong(int x)
	{
		int sum=0 , temp=x;	do {	
		int d=x%10;
		sum=sum+fact(d);
       x=x/10;

	}while(x!=0);

	
	if(sum==temp)
		return temp;
	else 
		return 0;
}
static int fact(int n)
{
	int fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}
}