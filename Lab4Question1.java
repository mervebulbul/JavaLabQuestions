package question1;

public class question1 {

	public static void main(String[] args) {
		// For loop examples
		int line = 1;
		/*
		 * for (line = 1; line <= 5; line++) { for (int j = 1; j <= 5 - (line - 1); j++)
		 * { System.out.print("-"); } System.out.println(); }
		 */
		for (line = 1; line <= 6; line++) {
			for (int j = 1; j <= 5 - (line - 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (line - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
