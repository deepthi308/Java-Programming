package problem_solving;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		
	 int[] num = { 0, 5 , 6, 8, 7, 9, 3, 1};
	 int greatestNum = num[0];
	 int smallestNum = num[0];
	 
	 for(int i=1; i<num.length; i++) {
		 if(greatestNum < num[i]) {
			 greatestNum = num[i];
		 }
		 if(smallestNum > num[i]) {
			 smallestNum = num[i];
		 }
		
	 }
	 
//	 System.out.println(greatestNum);
//	 System.out.println(smallestNum);
	 
	 missingNumber(num, greatestNum, smallestNum);
	 
	
	}

	private static void missingNumber(int[] num, int greatestNum, int smallestNum) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int number : num ) {
			set.add(number);
		}
		
		System.out.println("The Missing Numbers Are : ");
		for( int i=smallestNum; i<greatestNum; i++) {
		if(!set.contains(i)) {
			System.out.print(i+ " ");
		}
		}
		
		
		
	}

	

	
}
