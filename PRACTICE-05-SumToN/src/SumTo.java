import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Gets user integer 'n' and prints the sum of the numbers 1 to n
 * 
 * @author mcc12068703
 *
 */

public class SumTo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countTarget = 1;
		
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Please enter a number to count up to. Must be 1 or greater");
			try {
				countTarget = scanner.nextInt();
				if (countTarget < 1) {
					System.out.println("Invalid input. Number must be 1 or greater.");
				}
				else {
					validInput = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Input must be a number.");
				scanner.next();
			}
		}
		
		System.out.println("--Results--\n");
		int runningTotal = 0;
		for (int i = 1; i <= countTarget; i++) {
			System.out.println(i + runningTotal);
			runningTotal += i;
		}
	}
}
