package problem_solving;

import java.util.Scanner;

public class ReverseString {
	 static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	
	 
	 System.out.println("Enter the string to be reversed : ");
	 
	 String originalString = scanner.nextLine();
	 
	 int length =originalString.length()-1;
	 
	 System.out.println("Length of the string is : "+length);
	 
	 String reversedString = reverseAString(originalString, length);
	 
	 System.out.println("The reversed string is : " +reversedString);

	}

	private static String reverseAString(String originalString, int length) {
	
	
	
	String reversedString = "";
	 for(int i= length; i>=0; i--) {
		 
		 reversedString += originalString.charAt(i);
		 
	 }
	 return reversedString;
	}

}
