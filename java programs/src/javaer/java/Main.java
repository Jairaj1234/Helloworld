package javaer.java;

public class Main {

    public static void main(String[] args) {
    	int ele=10;
        SumArray aq = new SumArray();
        int[] a = aq.readArray();
        System.out.println("User entered values are:");
        aq.display(a);

        
        int rs = aq.array(a);
        System.out.println("Sum of the array elements: " + rs);
        getBiggest ae=new getBiggest();
        int small=ae.getBiggest1(a);
        System.out.println("biggest arrray element:"+small);
    
    Sumof aw=new Sumof();
    int sum=aw.sumOf1(a);
   System.out.println(sum);
   Primenos s=new Primenos();
  int d= s.Prime(a);
  System.out.println("total no of prime elements in a array is "+d);
  Pallindrome p1=new Pallindrome();
 int count= p1.isPallindrome(a);
 System.out.println("total no of pallindrome no in array is:"+count);
 isRepeit we=new isRepeit();
 int ple=we.isrepit(a,ele);
 System.out.println(ple);
}}
