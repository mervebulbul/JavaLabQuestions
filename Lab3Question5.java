package question5;

public class question5 {
	
	public static void largestAbsVal(int num1, int num2, int num3) {
		int abs_num1 = Math.abs(num1);
		int abs_num2 = Math.abs(num2);
		int abs_num3 = Math.abs(num3);
		int max = Math.max(abs_num1, abs_num2);
		int largest = Math.max(max, abs_num3);
		System.out.println("Absolute max is " + largest);

	}

	public static void main(String[] args) {
		largestAbsVal(-390, -234, -459);

	}

}
