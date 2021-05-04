
public class question1 {

	public static void main(String[] args) {
		// to find last digit

		int last = lastDigit(-39847);
		System.out.println("Last digit of -39847 is: " + last);
		last = lastDigit(462);
		System.out.println("Last digit of 462 is: " + last);

	}

	public static int lastDigit(int num) {
		int d = Math.abs(num) % 10;
		return d;
	}
}
