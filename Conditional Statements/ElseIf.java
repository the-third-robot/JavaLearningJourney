package conditionalStaatements;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		if (num<10) {
			
			System.out.println("Number is less than 10.");
			
		} else if (num>=10 && num<20) {
			
			System.out.println("Number lies between 10-20.");
			
		} else if (num>=20 && num<30){
			
			System.out.println("Number lies between 20-30.");
			
		}else {
			
			System.out.println("Number is greater than 30.");
			
		}
	}

}
