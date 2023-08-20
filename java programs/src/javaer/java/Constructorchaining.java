package javaer.java;

public class Constructorchaining {
	int age;
	String name;
	Constructorchaining(int age){
		this.age=age;
		
	}
	Constructorchaining(int age,String name) {
		this(age);
		this.name=name;
	}
	
	public static void main(String[] args) {
		Constructorchaining c=new Constructorchaining(20,"tom");
		System.out.println("age:"+c.age);
		System.out.println("name:"+c.name);
	}

}
