package typeCasting;

public class MannualTypeCastingOrNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double myDouble = 5.236;
		
		// Wrong way  " int myInt = myDouble;"
		
		int myInt = (int)myDouble;
		//Correct Way, we have to define the the value has to be integer as (int)
		
		System.out.println(myDouble);
		System.out.println(myInt);
		
	}

}