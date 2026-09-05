package Inheritence;

class Person{
	String name="James";
}


class Employe extends Person{
	int salary=1000;
	
	void display() {
		System.out.println("Name : " +name + "Salary : " +salary);
	}
	
}

class Developer extends Employe{
	String programmingLanguage="Java";
	
	@Override
	 void display() {
		super.display();
		System.out.println("programmingLanguage is : " + programmingLanguage);
	}

}


public class TestInheritence3 {
     public static void main(String[] args) {
		Developer dp = new Developer();
		dp.display();
	}
 
}
 
