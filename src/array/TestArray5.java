package array;

import java.util.Scanner;

public class TestArray5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the values of the array");
		
		int size = input.nextInt();
		
		int[] array= new int[size];
		
		System.out.println("My size is : " +size);
		
		 int values = input.nextInt();
		 
		//Inserting the values. 
		
		 for(int i =0;i<size;i++) {
			 array[i]=input.nextInt();
			
		 }
		 
		 System.out.println("Enter Target number to be search.:");
		 
		 int target = input.nextInt();
		 
		 int count=0;
		 
		 for(int i =0;i<array.length;i++) {
			 if(array[i]== target) {
				 count=count +1;
				 System.out.println("Target Number is identified. " +count); 
			 }
			
		 }
		 
		 
	}
	
}
