package Abstraction;

abstract class Shape{
	
abstract void  area();

}

class Circle extends Shape{
    int radius=89;
    
	@Override
	void area() {
		// TODO Auto-generated method stub
		double  area=3.14 * radius * radius;
		
		System.out.println(area);
	}
	
}

class Rectangle extends Circle{
	int lenght =22;
	int width=88;
	@Override
	
	void area() {
		int result = lenght * width;
		System.out.println("Result : " +result);
	}
	
	
	
}



public class TestAbstraction {
      public static void main(String[] args) {
		Circle crl = new Circle();
		crl.area();
		Rectangle rtngl = new Rectangle();
		rtngl.area();
		 
	}
}
