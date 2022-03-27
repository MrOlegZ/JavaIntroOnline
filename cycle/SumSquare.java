package by.jonline.pr01.cycle;

/*
 * Find the sum of squares of the first 100 natural numbers
 */

public class SumSquare {

	public static void main(String[] args) {

		long res = 0;

		for (int i = 0; i <= 100; i++) {
			res += i * i;
		}
		
		System.out.println("The sum of squares of the first 100 natural numbers is " + res);

	}

}
