package conditionalStaatements;

import java.util.Scanner;

public class HeOrSheLovesMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int noOfPetals = sc.nextInt();
		
		if (noOfPetals%2==1) {
			
			System.out.println("He/She loves me not.");
			
		} else {
			
			System.out.println("He/She loves me.");
			
		}
	}

}
