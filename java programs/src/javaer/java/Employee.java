package javaer.java;

public class Employee {
	int id;
	String name;
	Double salary;
	Employee( int id){
		this.id=id;

	}
	Employee(int id,String name){
		this(id);
		this.name=name;

	}
	Employee(int id,String name,Double salary){
		this(id,name);
		this.salary=salary;
	}

	public static void main(String[] args) {
      Employee e=new Employee(20,"tom",2000.0);
System.out.println("id:"+e.id);
System.out.println("name:"+e.name);
System.out.println("salary:"+e.salary);
	}

}
