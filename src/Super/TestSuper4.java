package Super;


class Vehicle {
	
	String vName;
	
	Vehicle(String cVname){
		vName=cVname;
		
	}
}

class Car extends Vehicle{

	Car(String cVname) {
		super(cVname);
		// TODO Auto-generated constructor stub
	}
	
}


public class TestSuper4 {
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Vehicle created");
		Vehicle v1 = new Vehicle("Car created");
		
		System.out.println(v.toString() );
		System.out.println(v1.toString() );
	}

}
