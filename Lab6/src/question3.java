
public class question3 {

	public static void main(String[] args) {
		// distance calculation on x-y coordinate system
		distance(0, 3, 0, 4);

	}

	public static void distance(int x1, int x2, int y1, int y2) {
		double d;
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance between(\"+x1\",\"+y1\") and (\"+x2\",\"+y2\") is " + d);
	}

}
