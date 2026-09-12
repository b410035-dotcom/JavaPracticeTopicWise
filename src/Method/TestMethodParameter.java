package Method;
//Simple Calculator

//Create a class Calculator with methods: add(int a, int b) subtract(int a, int b) and print the results.


public class TestMethodParameter {
	
	public static void main(String[] args) {
		
		int addition=add(4, 07);
		
		int subtraction = subtract(90, 55);
	}
	
	public static int add(int a, int b) {
		
		int result = a+b;
		
		System.out.println("Sum is :" + result);
		
		return result;
		
	}
	
	
public static int subtract(int a, int b) {
		
		int result = a-b;
		
		System.out.println("Sum is :" + result);
		
		return result;
		
	}

	

}
