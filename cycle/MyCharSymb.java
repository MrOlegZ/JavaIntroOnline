package by.jonline.pr01.cycle;

/*
 * Print match between char symbols and their codes
 */

public class MyCharSymb {

	public static void main(String[] args) {

		for (int i = 32; i <= 255; i++) {
			System.out.println(i + " = " + (char)i);
		}

	}

}
