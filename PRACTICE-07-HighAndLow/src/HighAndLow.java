import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Accepts 7 numbers and decides the highest and lowest
 * 
 * @author mcc12068703
 *
 */

public class HighAndLow {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
		
		int highestInd = 0;
		int lowestInd = 0;
		for (int i = 0; i < 7; i++) {
			int userInput = getNumber("Please Enter a number");
			inputNumbers.add(userInput);
			
			if (userInput < inputNumbers.get(lowestInd)) {
				lowestInd = i;
			}
			if (userInput > inputNumbers.get(highestInd)) {
				highestInd = i;
			}
			
			System.out.printf("Thank you. I have %d / 7 numbers\n", i + 1);
		}
		System.out.println("\n--Results--\n");
		System.out.printf("Highest Number is %d\n", inputNumbers.get(highestInd));
		System.out.printf("Lowest Number is %d\n", inputNumbers.get(lowestInd));
				
		scanner.close();
	}
	
	public static Integer getNumber(String message) {
		
		Integer number = 0;
		boolean validInput = false;
		while (!validInput) {
			System.out.println(message);
			try {
				number = scanner.nextInt();
				validInput = true;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Input must be a number.");
				scanner.next();
			}
		}
		return number;
	}
}
