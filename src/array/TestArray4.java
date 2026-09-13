package array;

public class TestArray4 {
   
	public static void main(String[] args) {
		
		/*
		 * Enter number of elements: 6. Enter 6 numbers: 2 4 2 5 2 7 Enter the number to
		 * find occurrences: 2 Number 2 occurs 3 times in the array. occurence for
		 * searching .....
		 */
        

	int[] array = {4,3,4,8,9,4};
	
	int target=4;
	int count=0;
	for(int i =0; i<array.length;i++) {
		if(array[i] == target) {
			count++;
			System.out.println("Matched number found.!!");
		}
		else {
		System.out.println("Matched Not found");
	}
		
		
	}
	
	}
}
	
 
