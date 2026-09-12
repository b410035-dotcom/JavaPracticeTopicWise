package Method;

import java.util.Scanner;

// Write a method isEven(int n) that returns true if the number is even, otherwise false.

public class TestMethodParameter2 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	int number = input.nextInt();
		
		 if(isEven(number) ==true) {
			 System.out.println("Even");
		 }else {
			 System.out.println("Odd");
		 }
	} 
	
	
	public static boolean isEven(int n) {
	
		
		if(n % 2 ==0) {
			return true;
		}else {
			return false;
		}
			
		
		
		
	}
	
	

}
