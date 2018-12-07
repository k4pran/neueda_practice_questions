
/**
 * Prints times tables up to 12
 * 
 * @author mcc12068703
 *
 */

public class TimesTables {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.printf("%d\t", i * j);
			}
			System.out.println();
		}
	}
}
