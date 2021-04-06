package question6;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 1; i <= 20; i++) {
			int printNum;
			printNum = num1 + num2;
			System.out.print(printNum + "  ");
			num1 = num2;
			num2 = printNum;
		}
	}

}
