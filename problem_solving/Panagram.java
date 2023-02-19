package problem_solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v','w','x', 'y', 'z'};
		
		System.out.println("Enter the string to check whether it is panagram or not : ");
		
		String text = scanner.nextLine();
		
		checkAndPrintPanagram(text, alphabets);
	}

	private static void checkAndPrintPanagram(String text, char[] alphabets) {
		
		int textlength = text.length();
       
		char[] textinchar = new char[textlength];
		
		
		
		for(int i=0; i<textlength; i++) {
			textinchar[i]=text.charAt(i);
		}
		
		System.out.println(Arrays.toString(textinchar));
		
		HashSet<Character> set = new HashSet<Character>();
		
		for ( char character :  textinchar) {
			
			set.add(character);
		}

		
		for(char letter : alphabets) {
			if(set.contains(letter)) {
				System.out.println(letter + " : 1(Present)");
			}
			
			if(!set.contains(letter)) {
				System.out.println(letter + ": 0(Not Present)");
			
		}
//		
		}
	}
}
