package Basic;

import java.util.Scanner;

// Create a program to add two numbers.

public class TestBasic2 {
  public static void main(String[] args) {
 
	
	// Input from the User.
	
	Scanner input = new Scanner(System.in);
	
	     int x= input.nextInt();
	     int y = input.nextInt();
	     
	 int add = x+y;    
	 
	 System.out.println("Sum of 2 number is : " + add);
	
}
}
