package conditionalStaatements;

import java.util.Scanner;

public class IfStsatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Congratulations! You are the responsible person of Developing India, and also you have the right of Voting" );
		}
	}

}
