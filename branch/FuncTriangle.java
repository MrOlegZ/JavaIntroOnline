package by.jonline.pr01.branch;

/*Given: Two angles in degrees.
 * To solve: Does such triangle exist. If Yes - does it right triangle 
 */

public class FuncTriangle {

	public static void main(String[] args) {

		double a = 65;
		double b = 30;

		double g = 180.0 - (a + b);

		if ((a > 0) && (b > 0) && (g > 0)) {

			if ((g == 90.0) || (a == 90.0) || (b == 90.0)) {
				System.out.println("Triangle with angles " + a + " and " + b + " is right triangle");
			} else {
				System.out.println("Triangle with angles " + a + " and " + b + " exists");
			}

		} else {
			System.out.println("There is no triangle with angles " + a + " and " + b);
		}

	}

}
