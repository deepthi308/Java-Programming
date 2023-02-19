package problem_solving;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		
		findLongestString(str.toUpperCase());

	}

	private static void findLongestString(String str) {

    //string la iruka character ah oru set la podanum
		
		//oru oru vaati oru character ah andha set la podumbodhum adhu 
		//already iruka ni check pannanum
		
		//adhu already irundha set ah clear pannanum
		//current value ah kaali pannanum
		
		// adhu already illana andha character ah set la add pananum 
		//current value la append pannanum 
		//current value oda length longest value length oda adhigam ah irundhuchi na
	// we should set the current value as the longest value
		
		//Finally we should print the longest value
		
		int length = str.length();
		
		String longest = "";
		String current = "";
		
		HashSet<Character> set = new HashSet<Character>();
		  
		for( int i = 0; i < length; i++) {

			char ch = str.charAt(i);
			
			if(!set.contains(str.charAt(i))) {
				 
				current += str.charAt(i);
				set.add(str.charAt(i));
			}
			else if(set.contains(str.charAt(i))) {
				current = "";
				set.clear();
			}
			else {
				
			}
			if(current.length() > longest.length()){
				longest = current;
			}
			
			
		}
		
		
		System.out.println("The longest substring is : "+ longest);
		
		
	}

}
