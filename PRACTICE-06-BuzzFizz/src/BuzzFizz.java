
/**
 * Counts to 1000
 * Prints Buzz for multiples of 3
 * Prints Fizz for multiples of 5
 * Prints Buzz Fizz for both
 * Prints count if neither
 * 
 * @author mcc12068703
 *
 */

public class BuzzFizz {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {
			String toPrint = "";
			boolean buzzOrFizz = false;
			
			// Check For multiples. Concat if multiples of 3 and 5
			if (i % 3 == 0) {
				toPrint += "Buzz ";
				buzzOrFizz = true;
			}
			if (i % 5 == 0) {
				toPrint += "Fizz";
				buzzOrFizz = true;
			}
			
			// Check if any multiples else print loop count
			if (buzzOrFizz) {
				System.out.println(toPrint);
			}
			else {
				System.out.println(i);
			}
		}
	}
}
