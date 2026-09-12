package Method;

import java.util.Scanner;

///Multiplication

public class TestMethodParameter5 {

	public static void main(String[] args) {
		
		
		
		System.out.println("User Enter a Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for(int i=1;i<=10;i++) {
			int multiplication = number * i;
			//System.out.println(i);
			
			//System.out.println(number * i );
			
			
			System.out.println("Multiplication of " +  number + "*" + i + "=" + multiplication);
			
		}
		
		
	}
	
}
