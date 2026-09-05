package Super;

class Animal{
	void sound() {
		System.out.println(" i am the ZOO Keeper......");
	}
	
	
}

class Dog extends Animal{
	
	void display () {
		super.sound();
		System.out.println("i am Dog. who is the Animal.....");
	}
	
}

public class TestSuper {
	public static void main(String[] args) {
		
		Dog dg = new Dog();
		dg.display();
		
	}

}
