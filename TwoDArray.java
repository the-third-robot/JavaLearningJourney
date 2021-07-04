package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// defining array with 4 rows and three columns with max index as 3rd row and 2nd column.
		int Class [][] = new int [4][3];
		// redefining the value of 2D array with specified position.
		Class [2][1] = 35;
		
		System.out.println(Class[2][1]);
		
		// Initialization  of 2D array.
		
		int Salary [][] = {
				
				{1000,5000,7000,10000,15000},
				{12000,20000,30000},
				{30000,50000,70000},
				{100000,200000}
		};
		
		System.out.println("Salary is "+ Salary[3][1] + " Rupees per Month.");
	}

}
