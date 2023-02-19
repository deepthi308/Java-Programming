package problem_solving;

import java.util.HashSet;

public class StringCompression {

	public static void main(String[] args) {
		
	 String string = "aabbcccdddd";
	 
	 String compressedString = compressTheString(string);

	}

	private static String compressTheString(String string) {
		
		//create a set
		//if the character is not present in the set add the char to the set
		//and also append it in the compressed string
		//and also increase the value of the set
		//if the character is already present in the set
		//just increase the count and append the count in the compressedString
		
		String compressedString = "";
		
		HashSet<Character> set = new HashSet<Character>();
		
		for ( int i = 0, count = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			
			if(!set.contains(ch) ) {
				
				count++;
				compressedString += ch;
				set.add(ch);
				
			}
			
			else {
				
			}
		}
		
		return compressedString;
	}

}
