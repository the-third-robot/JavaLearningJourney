package userInput;

public class SimpleInterest {

	public static void main(String[] args) {

		int principal = 300;
		
		float rate = 8.2f;
		//Can also be written as " float rate = (float)8.2;
		
		int time = 12;
		
		float simpleInterest = principal*rate*time/100;
				
				System.out.println("Simple Interest Is " + simpleInterest);

	}

}
