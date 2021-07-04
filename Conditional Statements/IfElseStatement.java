package conditionalStaatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Congratulations! You have the right to Vote.");
		}else {
			System.out.println("You are not qualified to Vote.");
			
			System.out.println("                    Thank you.");
		}
	}

}
