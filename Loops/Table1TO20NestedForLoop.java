package loops;

public class Table1TO20NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <=20; j++) {
		
			int tableOf = j;
			
			for (int i = 1; i <= 10; i++ ) {
			
			System.out.print(tableOf*i + " ");
			
			}
		System.out.println();
		}
	}

}
