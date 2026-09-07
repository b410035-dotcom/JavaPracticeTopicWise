package IfElse;

import java.util.Scanner;

//Create a program that determines if a number is positive, negative, or zero from User.

public class TestIfElse1 {
	
	public static void main(String[] args) {
		   System.out.println("User please enter any number......");
		Scanner input = new Scanner(System.in);
		
	   int number=input.nextInt();
	   

	   
	   if(number<0) {
		   System.out.println("Entered Number is Negative....");
	   }else if(number>0) {
		   System.out.println("Entered Number is Positive....");
		   
	   }else {
		   System.out.println("Entered Number is Zero.....");
	   }
		 
		
	}

}
