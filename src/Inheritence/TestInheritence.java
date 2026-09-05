package Inheritence;


//Question 

/*Single Inheritance

Create a class Employee with fields name and salary.

Derive a class Manager that adds department.

Write a program to print manager details.*/



class Employee{
	
	String name="Brock";
	int salary=900000;
	
	void display() {
		System.out.println("Name :" +name);
		System.out.println("Salary :" +salary);
	}
	
}

class Manager extends Employee{
	String department ="IT";
	@Override
	void display() {
		super.display();
		System.out.println("Department : " +department);
	}
	
}






public class TestInheritence {
public static void main(String[] args) {
	 Manager mgr = new Manager();
	 
	 mgr.display();
}
}