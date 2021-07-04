package arrays;

import java.util.Scanner;

public class AvarageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner (System.in);
		
		System.out.print("Enter the number of students in your Class : ");
		
		int n = sc.nextInt();
		
		System.out.println();
		
		int Marks[] = new int [n];
		
		for (int i =  0; i < n ; i++ ) {
			
			System.out.print("Please enter the marks of student number " + i + " in integer form : ");		
			
			Marks [i] = sc.nextInt();
			
			System.out.println();
		}
				
		System.out.println("Thank you for submitting the marks of students.");
		
		System.out.println();
		
		int TotalMarks = 0;
		
		for (int i = 0; i < n; i++) {
			
			TotalMarks = TotalMarks + Marks [i];
			
		}
		
		int AverageMarks = TotalMarks / n;
		
		System.out.println("The average marks of " + n + " students of your classroom is equal to " + AverageMarks);
	}

}
