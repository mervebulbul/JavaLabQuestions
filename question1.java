package question1;

public class question1 {
	public static void printNumber(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print("[" + i + "]" + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		printNumber(5);
	}

}
