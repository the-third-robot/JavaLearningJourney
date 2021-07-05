package operator; 

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		
		
		if (number>=1 && number<=100) {
			
			System.out.println("The number you have entered lies between 1 - 100.");
			
		} else {
			
			System.out.println("The number you have entered does not lies between 1 - 100.");
		}
		
		int grade = sc.nextInt();
		
		if (grade==10 || grade==12) {
			
			System.out.println("You can give board exams.");
		
		}else {
			
			System.out.println("Sorry! You will not be able to give the Board Exams This year.");
		}
	}

}
