package ArithmeticOperator;

import java.util.Scanner;

//Create a program that takes two numbers and shows result of all arithmetic operators (+, -, *, /, %).


public class TestArithmetic {
      public static void main(String[] args) {
		
    	  Scanner input = new Scanner(System.in);
    	  
    	  System.out.println("Entered First Number :" );
    	  int number1=input.nextInt();
    	  
    	  
    	  
    	  System.out.println("Entered Secound Number :");
    	  int number2= input.nextInt();
    	  
    	  
    	  System.out.println();
    	   int add = number1 + number2;
    	   int subtract = number1 - number2;
    	   int multiplication = number1*number2;
    	   int division = number1/number2;
    	   
    	   System.out.println("Addition : " + add);
    	   System.out.println("Subtraction : " + subtract);
    	   System.out.println("Multiplication : " + multiplication);
    	   System.out.println("Division : " + division);
    	   
   
	}
}
