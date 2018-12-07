import java.util.Scanner;

/**
 * Counts up to a user-specified number and prints the result
 * 
 * @author mcc12068703
 */

public class CountUpTo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to count up to");
		int countTarget = scanner.nextInt();
		
		System.out.println("--Results--\n");
		for (int i = 1; i <= countTarget; i++) {
			System.out.println(i);
		}
	}
}
