package arrays;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {1,5,-6,7,12,3,2};
		int n = a.length;
		
		boolean sorted = true;
		
		for (int i = 0; i < n - 1; i++) {
			
//			for (int j = 0; j < n - 1; j++) {
			
//			As we all know that at the end of every iteration we will get the last number as greatest number and with every iteration the position of greatest number is reduced by 1 therefore we are using i in inner loop.
//			like : {2,1,3,5,6,4}
//			1. {1,2,3,5,4,  6} greatest number is 6 here at 5th index
//			2. {1,2,3,4,  5,6} greatest number is 5 here at 4th index
			
			for (int j = 0; j < n - 1 - i; j++) {
				
				if (a[j+1] < a[j]) {
					
					int temp = a[j+1];
					
					a[j+1] = a[j];
					
					a[j] = temp;
					
					sorted = false;
				}
			}
			
			if (sorted) break;
		}
		
		// Enhanced for loop to print the arrays in very less work:
		
		for (int iteratedArray : a) {
			
			System.out.print(iteratedArray + " ");
		}
	}

}
