package question9;

public class question9 {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i <= line * -1 + 5; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= line; i++) {
				System.out.print(line);
			}
			System.out.println();
		}

	}

}
