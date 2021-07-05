package stringsInJava;

public class AnagramSecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "baal";
		String b = "bala";
		
		int al [] = new int [256];
		int bl [] = new int [256];
		
		boolean isAnagram = true;
		
// using for each OR enhanced for loop.
// a.toCharArray() will separate the characters and  arrange the string in the array like an array of {b, a, a, l} 		
		for (char c : a.toCharArray()) {
			
//			System.out.println(c);
//		Will give the specific number of character through manual type casting which will get stored in the array al at specific space where the character is located.
			int index = (int) c;
// 		It will increase the index of that character in the array every time it gets found.
			al[index]++;			
		}

		for (char c : b.toCharArray()) {
			int index = (int) c;
			bl[index]++;					
		}
		
		for (int i = 0; i <256; i++) {
			
			if (al[i] != bl[i]) {
				
				isAnagram = false;
				break;
			}
		}
		
		if (isAnagram) {
			System.out.println("The two strings are Anagram");
		} else {
			
			System.out.println("The two strings are not anagram.");
		}
	}
}
