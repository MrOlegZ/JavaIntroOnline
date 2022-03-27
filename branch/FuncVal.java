package by.jonline.pr01.branch;

/* Done: function F(x) = x^2 - 3x + 9 if x <= 3 and
 * 				  F(x) = 1/(x^3 + 6) if x > 3
 * Find function value of random x
 */

public class FuncVal {

	public static void main(String[] args) {

		double x = -100.0 + 200.0 * Math.random(); // random value between [-100; 100)
		double f = 0.0;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3.0 * x + 9.0;
			System.out.println("F(x) = x^2 - 3x + 9");
		} else {
			f = 1 / (Math.pow(x, 3) + 6.0);
			System.out.println("F(x) = 1/(x^3 + 6)");
		}

		System.out.println("F(" + x + ") = " + f);

	}

}
