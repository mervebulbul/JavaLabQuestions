
public class question4 {

	public static void main(String[] args) {
		// payment calculation
		System.out.println("Total pay is " + pay(4.0, 11));
	}

	public static double pay(double hourlyPay, int totalHours) {
		double totalMoney;
		if (totalHours > 8) {
			totalMoney = (hourlyPay * 8) + ((totalHours - 8) * (hourlyPay * 1.5));
		} else {
			totalMoney = hourlyPay * totalHours;
		}
		return totalMoney;
	}
}
