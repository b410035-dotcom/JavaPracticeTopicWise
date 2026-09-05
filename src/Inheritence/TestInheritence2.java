package Inheritence;


class Vehicle  {
	  void display() {
		  System.out.println("Put Fuel in the Vehcile.........");
	  }
	 
}

class Car extends Vehicle{
	@Override
	void display() {
		System.out.println("Petrol override here ");
	}
	 
	
}

class Truck extends Car{
	
	@Override
	
	void display() {
		System.out.println("Diesel override.....");
	}
	
}




public class TestInheritence2 {
	
	public static void main(String[] args) {
		  Vehicle v;
		  v= new Car();
		 
		  v.display();
		  v= new Truck();
		  v.display();
		  
		  
		   
		  
	}
   
    
}
