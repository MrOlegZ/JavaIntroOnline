package by.jonline.pr01.cycle;

import java.util.Scanner;

/*
 * Find all dividers of the natural numbers in range [m, n], except
 * 1 and itself
 */

public class FuncDividers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range of natural numbers");
		System.out.print("Enter m: ");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Input correct natural number m ->");
		}

		int m = sc.nextInt();

		System.out.print("Enter n: ");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Input correct natural number n ->");
		}

		int n = sc.nextInt();

		for (int i = m; i <= n; i++) {
			System.out.print("Dividers of " + i + " (except 1 and itself) is: ");

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + "; ");
				}
			}
			System.out.println();

		}

	}

}
