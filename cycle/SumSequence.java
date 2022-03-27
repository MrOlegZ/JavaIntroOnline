package by.jonline.pr01.cycle;

/*
 * Done: n; sequence a(n) = 1/2^n + 1/3^n; double e
 * Find: sum of elements a(n) >= e
 */

public class SumSequence {

	public static void main(String[] args) {

		long n = 10;
		double e = 0.4;

		double a;
		double res = 0;

		for (int i = 1; i <= n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (a >= e) 
				res += a;
		}
		
		System.out.println("The sum of seqense is " + res);
	}

}
