package by.jonline.pr01.cycle;

import java.util.Scanner;

/* Done: User enters positive integer number N
 * To do: The program sums all numbers from 1 till N 
 */

public class FuncSum {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		long n;
		long res = 0;

		System.out.print("Enter positive integer number: ");

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter valid number: ");
		}

		n = sc.nextLong();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				res += i;
			}
			System.out.println("The sum of all positive numbers from 1 to " + n + " is " + res);
		} else {
			System.out.println("Number must be greater than 0");
		}

	}

}
