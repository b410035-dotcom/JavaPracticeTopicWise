package Method;

import java.util.Scanner;

// Develop a program that prints the multiplication table for a given number.



public class TestMethod1 {

	
	public static void main(String[] args) {
		//System.out.println("User Enter any number for muliplication....");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		  System.out.println("Multiplication Table of " + number + ":");
		for(int x=1;x<=10;x++) {
			 System.out.println(number + " x " + x + " = " + (number * x));
			
		}
		 
		}
		 
	 

}
