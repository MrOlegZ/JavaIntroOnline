package by.jonline.pr01.cycle;

import java.util.Scanner;

/*
 * Done two numbers. Find the numerals, which can be found in each of them
 */

public class EqualNumbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter fitst integer number: ");
		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter correct number -> ");
		}

		long a = sc.nextLong();
		int qA = (a == 0) ? 1 : (int) (Math.log10(a) + 1); // Quantity of the numerals in number a

		System.out.print("Enter second integer number: ");
		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter correct number -> ");
		}

		long b = sc.nextLong();
		int qB = (b == 0) ? 1 : (int) (Math.log10(b) + 1); // Quantity of the numerals in number a

		int[] numA = new int[qA]; // Array of the numerals of number A
		int[] numB = new int[qB]; // Array of the numerals of number B
		int[] useA = new int[9]; // Numerals in number A
		int[] useB = new int[9]; // Numerals in number B

		// Finding numerals of the first number
		long temp = a;
		for (int i = (qA - 1); i > 0; i--) {
			numA[i] = (int) (temp % 10);
			temp /= 10;
		}
		numA[0] = (int) temp;

		// Finding numerals of the second number
		temp = b;
		for (int i = (qB - 1); i > 0; i--) {
			numB[i] = (int) (temp % 10);
			temp /= 10;
		}
		numB[0] = (int) temp;

		// Sorting numerals of the first number (Sort Ascending and removing duplicates)
		// Using Shuttle Sort
		for (int i = 1; i < qA; i++) {
			if (numA[i] < numA[i - 1]) {
				numA[i] = numA[i] + numA[i - 1]; // Swap two elements
				numA[i - 1] = numA[i] - numA[i - 1]; // without using
				numA[i] = numA[i] - numA[i - 1]; // temporary variable

				for (int j = i - 1; j - 1 >= 0; j--) {
					if (numA[j] < numA[j - 1]) {
						numA[j] = numA[j] + numA[j - 1]; // Swap two elements
						numA[j - 1] = numA[j] - numA[j - 1]; // without using
						numA[j] = numA[j] - numA[j - 1]; // temporary variable
					} else
						break;
				}
			}
		}

		// Removing duplicate numerals in first number
		useA[0] = numA[0];
		int kA = 0; // Quantity of used numerals in first number
		for (int i = 1; i < qA; i++) {
			if (!(numA[i] == numA[i - 1])) {
				kA++;
				useA[kA] = numA[i];
			}
		}

		// Sorting numerals of the second number (Sort Ascending and removing
		// duplicates)
		// Using Shuttle Sort
		for (int i = 1; i < qB; i++) {
			if (numB[i] < numB[i - 1]) {
				numB[i] = numB[i] + numB[i - 1]; // Swap two elements
				numB[i - 1] = numB[i] - numB[i - 1]; // without using
				numB[i] = numB[i] - numB[i - 1]; // temporary variable

				for (int j = i - 1; j - 1 >= 0; j--) {
					if (numB[j] < numB[j - 1]) {
						numB[j] = numB[j] + numB[j - 1]; // Swap two elements
						numB[j - 1] = numB[j] - numB[j - 1]; // without using
						numB[j] = numB[j] - numB[j - 1]; // temporary variable
					} else
						break;
				}
			}
		}

		// Removing duplicate numerals in second number
		useB[0] = numB[0];
		int kB = 0; // Quantity of used numerals in second number
		for (int i = 1; i < qB; i++) {
			if (!(numB[i] == numB[i - 1])) {
				kB++;
				useB[kB] = numB[i];
			}
		}

		System.out.println("Common used numerals in both numbers are:");

		// Finding common numerals
		for (int i = 0; i <= kA; i++) {
			for (int j = 0; j <= kB; j++) {
				if (useA[i] == useB[j]) {
					System.out.print(useA[i] + "; ");
				}
			}
		}

	}

}
