package Method;

import java.util.Scanner;

//Write a method max(int a, int b) that returns the larger of the two numbers.

public class TestMethodParameter3 {
	
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		
		int num1= input.nextInt();
		int num2=input.nextInt();
		
		System.out.println(max(num1, num2));;
		
		
	}
      
	public static int max(int a, int b) {
		
		
		
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
	}
	
	
}
