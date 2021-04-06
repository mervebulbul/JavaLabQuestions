package question3;

public class question3 {
	public static void printPowersOfN(int base, int power) {
		for (int i = 0; i <= power; i++) {
			System.out.print(Math.pow(base, i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		printPowersOfN(-2, 8);
	}

}
