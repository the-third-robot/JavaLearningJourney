package stringsInJava;

public class ReverseAStringWordByWord {

	public static void main(String[] args) {
		
		System.out.println(reverseString ("    I am Not the best but  I can   be   the best  ."));

	}
	
	public static String reverseString (String enter) {
		
		int i = enter.length() - 1;
		String ans = "";
		
		while (i >= 0) {
			
			while (i >=0 && enter.charAt(i) == ' ') i--;
			int j = i;
			while (i >= 0 && enter.charAt(i) != ' ')i--;
			
			if (i < 0) break;
			
			if (ans.isEmpty()) {
				ans = ans.concat(enter.substring(i + 1, j + 1));
			}else {
				ans = ans.concat(" " + enter.substring(i + 1, j + 1));
			}
			
		}
		return ans;
	}

}
