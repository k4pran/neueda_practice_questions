/**
 * Write a program that takes a list of numbers e.g. a = [5, 10, 15, 20, 25]
 * and makes a new list of only the first and last elements of the given list. 
 * 
 * @author mcc12068703
 *
 */


public class ListEnds {

	public static void main(String[] args) {
		
		int[] exampleNumbers = new int[] {11, 11, 14, 10, 9, 2, 11, 9, 1, 14, 0, 19, 18, 13, 11, 17, 1, 3, 16};
		
		// Get first and last from example list
		int[] newList = new int[]{
				exampleNumbers[0], 
				exampleNumbers[exampleNumbers.length - 1]};
		
		System.out.println(newList[0]);
		System.out.println(newList[1]);
	}
}
