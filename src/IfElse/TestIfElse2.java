package IfElse;

import java.util.Scanner;

//Create a program that determines the greatest of the three numbers....

public class TestIfElse2 {
	  public static void main(String[] args) {
		  
		  System.out.println("Entered 3 Number...");
		  
		  Scanner input = new Scanner(System.in);
		  
		   int number1=input.nextInt();
		   int number2=input.nextInt();
		   int number3=input.nextInt();
		   
		   if (number1>number2) {
			   System.out.println("Number1 is Greater.!!!!");
			   
		   }else if(number2>number3) {
			   System.out.println("Number2 is Greater..!!!");
			   
		   }else if(number1== number2 || number2== number3 || number1==number3){
			   System.out.println("All the Number is Same..!!");
		   }else {
			   System.out.println("Number3 is Greater..!!");
		   }
		   
	}
	

}
