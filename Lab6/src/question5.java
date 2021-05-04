
public class question5 {

	public static void main(String[] args) {
		// triangle area
		System.out.println("Area of triangle: " + triangleArea(8, 5.2, 7.1));

	}

	public static double triangleArea(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}

}
