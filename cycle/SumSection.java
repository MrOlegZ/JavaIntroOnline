package by.jonline.pr01.cycle;

/*
 * To do: Section [a, b], step h
 * 		  y = x, if (x > 2)
 * 		  y = -x, if (x <= 2)
 * Find: Values of the function y on the section [a, b] with the step h
 */

public class SumSection {

	public static void main(String[] args) {

		double a = -10.0;
		double b = 10.0;
		double h = 1.0;

		double x = a;
		double y;

		while (x <= b) {
			if (x <= 2) {
				y = -x;
			} else
				y = x;
			System.out.println("y(" + x + ") = " + y);
			x += h;
		}
	}

}
