package problem_solving;

import java.util.HashSet;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		
		//Array1 = [ 1, 2, 3]
		//Array2 = [ 3, 4, 5]
		
		//3
		
		 int[] array1 = { 4, 1, 2, 3};
		 int[] array2 = { 5, 4, 7, 8};
		 
		 printIntersection(array1, array2);

	}

	private static void printIntersection(int[] array1, int[] array2) {
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int element : array1) {
			set.add(element);
		}
		
		
		System.out.println(set);
		
		System.out.println("The intersecting element is : ");
		for(int element : array2) {
			if(set.contains(element)) {
				System.out.println(element);
			}
		}
		
	}

}
