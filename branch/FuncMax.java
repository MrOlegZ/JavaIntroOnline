package by.jonline.pr01.branch;

// Find max(min(a,b), min(c,d));

public class FuncMax {

	public static void main(String[] args) {

		double a = -5.5;
		double b = 6.4;
		double c = -2.3;
		double d = 1;

		double minab;
		double mincd;
		double res;

		minab = (a <= b) ? a : b;
		mincd = (c <= d) ? c : d;
		res = (minab >= mincd) ? minab : mincd;
		
		System.out.println("max(min(" + a + ", " + b + "), min(" + c + ", " + d + ")) = " + res);
		/*
		 * System.out.println("max(min(" + a + ", " + b + "), min(" + c + ", " + d +
		 * ")) = " + Math.max(Math.min(a, b), Math.min(c, d)));
		 */
	}

}
