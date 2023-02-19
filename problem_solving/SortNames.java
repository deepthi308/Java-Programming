package problem_solving;


import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number of names you want to enter : ");
		
		int length = scanner.nextInt();
//	
		
		String[] names = new String[length];
		
		
		
		
		
		System.out.println("Enter the names you want to enter : ");
		
		for(int i=0; i<length; i++) {
			names[i] = scanner.nextLine();
		}
		
		System.out.println(names);
		
		 sortedNames(names, length);
//		

	}

	private static void sortedNames(String[] names, int length) {
		
		
		String temp;
		
		for(int i=0; i< length; i++) {
			for(int j=i+1; j<length; j++) {
				if(names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println(names);
		
	
	}

//	private static HashSet<String> sortedNames(ArrayList<String> names, int length) {
//		
//		HashSet<String> set = new HashSet<String>();
//		
//		for(String name : names) {
//			set.add(name);
//		}
//		
//		
////		System.out.println(set);
//		return set;
//	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
