import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Counts up in threes to a user-specified number and prints the result
 * 
 * @author mcc12068703
 *
 */

public class CountInThrees {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countTarget = 0;
		
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Please enter a number to count up to. Must be 1 or greater");
			try {
				countTarget = scanner.nextInt();
				if (countTarget < 0) {
					System.out.println("Invalid input. Number must be 0 or greater.");
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
		for (int i = 0; i <= countTarget; i += 3) {
			System.out.println(i);
		}
		scanner.close();
	}
}
