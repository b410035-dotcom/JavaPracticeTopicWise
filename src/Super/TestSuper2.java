package Super;

class Animals{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dogs extends Animals{
	
	void display() {
		super.sound();
		System.out.println(" Dog barks");
	}
}



public class TestSuper2 {
   public static void main(String[] args) {
	
	   Dogs dg = new Dogs();
	   
	   dg.display();
}
}
