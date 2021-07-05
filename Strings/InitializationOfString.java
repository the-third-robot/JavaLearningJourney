package stringsInJava;

public class InitializationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// By literal saves or the pre-saved values from String pool area uses repeatedly and optimizes the code hence they are same.
		String Name = "Rushikesh";
		String Name1 = "Rushikesh";
		
// Initialization by new object saves the string in Heap Memory and don't cares about whether it is present in String pool area and hence uses extra memory.
// As they are stored at two different places hence they can't be equal.
		
		String AnotherName = new String ("Rushikesh");
		
		System.out.println(Name == Name1);
		System.out.println(Name == AnotherName);
		
// Functions of string
		String Name2 = "Rushikesh Prakash Kumbhar.";
		String Name3 = "";
		
//		Name2 = Name2 + Name1 + "Concat";
//		System.out.println(Name2);
		
		System.out.println("Functions of Strings:");
		
		System.out.println("CharAt : " + Name.charAt(0));
		System.out.println("Reverse of charAt i.e. indexOf () execution : " + Name2.indexOf("a"));
		
		System.out.println("Length of the string :"+ Name2.length()); // Also calculates the spaces.
		
		System.out.println("Substring with beginning only : "+ Name2.substring(12));
		
		System.out.println("Substring with beginning as well as end index : " + Name2.substring(11, 22));
		
		System.out.println("Use of Contains Function : "+ Name2.contains("akash")); // Always returns a boolean value.
		
		System.out.println("Checking of values i.e. equals function : "+ Name1.equals(Name) + "   And also by new object and by literal check : "+ Name.equals(AnotherName));
		
		System.out.println("Using of isEmpty : "+ Name3.isEmpty() +"  &  " + Name2.isEmpty());
		
		System.out.println("Use of Function Concat : " + Name2.concat(Name));
		
		System.out.println("Use of replace function : " + Name1.replace("kesh", "raj"));
		System.out.println("Use of replace function : " + Name1.replace('k', 'r'));
		
//		Use of split function: 
		
		String Cars = "Suzuki, Maruti, Hyundai, Tata, Toyota, Mercedies, Jaguar, BMW.";
		
		String[] allCars = Cars.split(",");
		
		for (String CarNames : allCars) {
			
			System.out.println(CarNames);
		}
		
		System.out.println("Use of toLowerCase() to convert upper to lower : "+ Name2.toLowerCase());
		System.out.println("Use of toLowerCase() to convert lower to upper : "+ Name2.toUpperCase());
		
		String Name4 = "      Rushikesh Prakash Kumbhar.     ";
		System.out.println(Name4 + " " + " Use of Trim Function " + Name4.trim());
	}

//	private static Object concat() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
