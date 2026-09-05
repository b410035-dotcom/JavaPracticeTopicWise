package Super;

class Person{
	String name = "James";
}


class Employee extends Person{
	String name = "John";
	
	void display() {
		 System.out.println(name);
		 System.out.println(super.name);
	}
}




public class TestSuper3 {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.display();
	}

}
