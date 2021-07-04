package arrays;

public class ArrayIntroductionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] marks;
//		marks = new int [5];
		
//		int marks [];
//		marks = new int [5];
		
//		int  marks [] = new int [5];
		
		double  [] marks = {15.25, 65.2, 25, 23.54, 20.3};
		
//		marks [3] = 33.55; redefined value
		
		System.out.println(marks[3]);
		
		int [] age = { 1, 2, 5, 9, 10};
		
		System.out.println(age [4]);
		
		// Printing all the values of array using loops:
		// marks.length in the below loop gives the length of the array marks and (int) is given to convert double to integer 
		// thrugh mannual typecasting.
		
		for (int i = 0; i < (int) marks.length; i++ ) {
			
			System.out.print(marks [i]+ " ");
		}
		
	}

}
