package question5;

public class question5 {

	public static void main(String[] args) {
		for (int line = 1; line <= 4; line++) {
			for (int i = 1; i <= line * -1 + 4; i++) {
				System.out.print("_");
			}
			for (int i = 1; i <= line * 2 - 1; i++) {
				System.out.print(line);
			}
			for (int i = 1; i <= line * -1 + 4; i++) {
				System.out.print("_");
			}
			System.out.println();
		}

	}

}
