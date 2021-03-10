package Question1;

public class Question1 {

	public static void main(String[] args) {
		// TODO physics formula

		int s;        // position of a body in linear motion
		int s0;      // initial position
		int t;      // given time
		int v0;    // initial velocity
		int a;    // rate of acceleration
		s0 = 10;
		t = 5;
		v0 = 24;
		a = 5;

		s = s0 + v0 * t + 1 / 2 * a * t * t; // formula

		System.out.println(s);  // print the resulting value on the screen

	}

}
