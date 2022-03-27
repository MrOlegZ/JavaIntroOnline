package by.jonline.pr01.linear;

import java.util.Scanner;

/*Initial number R (nnn.ddd). Swap integer and fractional
 * parts of the number (ddd.nnn) 
 */

public class MyFunc04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number like nnn.ddd: ");
		double R = sc.nextDouble();
		
		int nnn = (int)R;
		int ddd = (int)((R - nnn) * 1000); 
		
		double Rsw = ddd + nnn / 1000.0;
		
		System.out.println("Your swapped number is: " + Rsw);
		
	}

}