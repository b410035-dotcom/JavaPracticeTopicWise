package array;

import java.util.Scanner;

public class TestArray3 {

	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		        // Ask user for size of array
		        System.out.print("Enter number of elements: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];  // create array
		        int sum = 0;

		        // Input array elements
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		            sum = sum + arr[i];  // add each element to sum
		        }

		        // Calculate average
		        double average = (double) sum / n;

		        // Print results
		        System.out.println("Sum = " + sum);
		        System.out.println("Average = " + average);
		        
		        System.out.println("Number of Occurences : " + n);

		        sc.close();
	}
	}