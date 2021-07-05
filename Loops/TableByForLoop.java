package loops;

import java.util.Scanner;

public class TableByForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int tableOf = sc.nextInt();
	
		for (int i = 1; i < 11; i++) {
			
			System.out.println(tableOf * i);
		
		}
	}

}
