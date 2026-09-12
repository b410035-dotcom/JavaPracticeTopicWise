package Method;

import java.util.Scanner;

public class TestMethodAdd {

	public static void main(String[] args) {
		
		int num1=readNumber();
		int num2 = readNumber();
		
		int sum=num1+num2;
		System.out.println("Sum is : " +sum);
		
	}
	
	
	public static int readNumber() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("User Please enter a number :");
		
		int number=input.nextInt();
	    
		
		
		
		return number;
	}
	
}
