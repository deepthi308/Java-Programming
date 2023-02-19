package problem_solving;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class SortNames2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ethna per enter panna poringa");
		
		int size = scanner.nextInt();
		scanner.nextLine();
		
		String[] names = new String[size];
		
		System.out.println("Per ah enter pannunga");
		
		for(int i=0; i<size; i++) {
			names[i]= scanner.nextLine();
		}
		
//		System.out.println(Arrays.toString(names));
		
		String[] sortedNames = sortNames(names);
		
		System.out.println(Arrays.toString(sortedNames));

	}

	private static String[] sortNames(String[] names) {
		
		String temp;
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
				    names[j] = temp;
				}
			}
		}
		
		return names;
	}

}
