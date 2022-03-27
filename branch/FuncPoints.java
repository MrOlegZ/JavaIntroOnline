package by.jonline.pr01.branch;

/* Done: 3 points A(x1, y1), B(x2, y2), C(x3, y3)
 * To solve: Do they belong one straight line (Ax + By + C = 0)?
 * 
 * Equation of a line, passing through 2 points:
 * (x - x1) / (x2 - x1) = (y - y1) / (y2 - y1);
*/

public class FuncPoints {

	public static void main(String[] args) {

		double x1 = 0.0;
		double y1 = 0.0;

		double x2 = 3.0;
		double y2 = 1.0;

		double x3 = 6.0;
		double y3 = 2.0;

		if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
			System.out.println("Points A, B, C belong one straight line");
		} else {
			System.out.println("Points A, B, C don't belong one straight line");
		}

	}

}
