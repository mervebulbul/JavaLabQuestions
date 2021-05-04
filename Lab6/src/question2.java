
public class question2 {

	public static void main(String[] args) {
		// Area of circle
		double radius = 2.0;
		System.out.println("Area of circle with radius " + radius + " is " + areaOfCircle(radius));
	}

	public static double areaOfCircle(double radius) {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
