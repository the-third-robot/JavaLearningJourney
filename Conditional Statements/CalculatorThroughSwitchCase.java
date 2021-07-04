package conditionalStaatements;

import java.util.Scanner;

public class CalculatorThroughSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First number...... ");
		
		float a = sc.nextFloat();
		
		System.out.println("Enter the Secont number...... ");
		
		float b = sc.nextFloat();
		
		System.out.println("Enter the Operationt which you wan to do on the numbers......");
		
		sc.nextLine();
		
		char operation = sc.nextLine().charAt(0);
		
		float result =0;
		
		switch (operation) {
		
		case '+' :
			
			result = a + b;
			
			break;
			
		case '-' :
			
			result = a - b;
			
			break;
			
		case '*' :
			
			result = a * b;
			
			break;
			
		case '/' :
			
			result = a / b;
			
			break;
			
		default : 
			
			System.out.println("Sorry! Invalid Operation.");
		
		
		}
		
		System.out.println("Solution = " + result);
		
	}

}
