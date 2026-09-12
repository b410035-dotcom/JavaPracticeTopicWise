package Method;

import java.util.Scanner;

// Create a method using a return keyword. add the number

public class TestMethod {
	
	public static void main(String[] args) {
	        	 int result = AddOneMethod() + AddSecoundMethod();
	        	 System.out.println("Result " + result);
	}
	
	public static int AddOneMethod() {
		Scanner input =new Scanner(System.in);
		
		int firstNum= input.nextInt();
		
		return firstNum;
		
	}
	
	public static int AddSecoundMethod() {
		Scanner input =new Scanner(System.in);
		
		int secoundNum= input.nextInt();
		
		return secoundNum;
		
	}
	
	

}
