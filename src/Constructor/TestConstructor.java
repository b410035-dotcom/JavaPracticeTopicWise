
//Git Push.....

package Constructor;



class Vehicle {
    String vName;

    // Parent constructor
    Vehicle(String cVname) {
        vName = cVname;
        System.out.println("Vehicle constructor called: " + vName);
    }
}



class Car {
    String model;

    // Child constructor (no super)
    Car(String modelName) {
        model = modelName;
        System.out.println("Car constructor called: " + model);
    }

    void display() {
        System.out.println("Car Model: " + model);
    }
}




public class TestConstructor {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic Vehicle");
        Car c = new Car("Sports Car");

        System.out.println("Vehicle Name: " + v.vName);
        c.display();
    }
    
     

}
