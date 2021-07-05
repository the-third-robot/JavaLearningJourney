package userInput;

import java.util.Scanner;

public class UserInputSimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		
		float rate = sc.nextFloat();
		
		int time = sc.nextInt();
		
		float simpleInterest = principal*rate*time/100;
				
		System.out.println("Simple Interest Is " + simpleInterest);
		
		//To get integer value of Simple Interest
		int intSI = (int)simpleInterest;
		
		System.out.println("Iiteger part of Simple Interest Is " + intSI);
		
	}

}
