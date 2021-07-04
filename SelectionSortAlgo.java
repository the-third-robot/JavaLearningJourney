package arrays;

public class SelectionSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = { 1, -6, -2, 3, 2, 5, 6};
		
		int n = a.length;
		
		for ( int i = 0; i < n - 1; i++ ) {			
			int MinIndex =  i;			
			for (int j = i; j < n - 1; j++) {				
				if ( a[j] < a[MinIndex]) {					
					MinIndex = j;
				}
			}			
			int temp = a [i];			
			a[i] = a[MinIndex];			
			a[MinIndex] = temp;			
		}
		
		for (int Answer : a) {
			
			System.out.print(Answer + " ");
		}
	}

}
