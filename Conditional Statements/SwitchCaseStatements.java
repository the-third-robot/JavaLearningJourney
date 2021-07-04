package conditionalStaatements;

import java.util.Scanner;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int dayOfWeek = sc.nextInt();
		
//		if (dayOfWeek == 1) {
//			
//		}
//		if (dayOfWeek == 2) {
//			
//		}
//		if (dayOfWeek == 3) {
//			
//		}
//		if (dayOfWeek == 4) {
//			
//		}
//		if (dayOfWeek == 5) {
//			
//		}
//		if (dayOfWeek == 6) {
//			
//		}
//		if (dayOfWeek == 7) {
//			
//		}
		
		switch (dayOfWeek) {
		
		case 1 :
			
			System.out.println("I have to attent college today.");
			
			break;
		
		case 2 :
			
			System.out.println("Today is the Internship Day.");
			
			break;
			
		case 3 :
			
			System.out.println("Practice Web Deveopement.");
			
			break;
			
		case 4 :
			
			System.out.println("Do some studies or we can say the weekely rivision.");
			
			break;
			
		case 5 :
			
			System.out.println("Do your video editing for channel.");
			
			break;
			
		case 6 :
			
			System.out.println("It's a Holiday so enjoy.");
			
			break;
			
		case 7 :
			
			System.out.println("It's a Holiday so enjoy.");
			
			break;
			
		default :
			
			System.out.println("I don't know what day it is. Invalid entry.");
			
			break;
			
		}
	}

}
