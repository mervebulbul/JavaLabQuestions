package question2;

public class question2 {
	public static void printPowersOf2(int power) {
		for (int i = 0; i <= power; i++) {
			System.out.print(Math.pow(2, i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOf2(4);
	}

}
