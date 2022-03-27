package by.jonline.pr01.cycle;

import java.math.BigInteger;

/*
 * Find the multiplication of squares of the first 200 natural numbers
 */

public class MultSquare {

	public static void main(String[] args) {

		BigInteger res = BigInteger.valueOf(1);	// <=> res = 1;
		BigInteger temp;
		
		for (int i = 1; i <= 200; i++) {
			temp = BigInteger.valueOf(i);	// <=> temp = i;
			temp = temp.pow(2);				// <=> temp *= temp;
			res = res.multiply(temp);		// <=> res *= temp;
		}
		
		System.out.println("The multiplication of squares of the first 200 natural numbers is " + res);

	}

}
