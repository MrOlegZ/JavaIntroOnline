package by.jonline.pr01.linear;

import java.util.Scanner;

/*Print "True" if Point(x, y) is in areas 1 and 2
 * 1: 0 <= y <= 4 and |x| <= 2
 * 2: -3 <= y <= 0 and |x| <= 4
 * "False" - otherwise
 */

public class MyFunc06 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the coordinates of the point");
		
		System.out.print("Input X: ");
		double x = sc.nextDouble();
		
		System.out.print("Input Y: ");
		double y = sc.nextDouble();
		
		if (((y >= 0.0) && (y <= 4.0) && (Math.abs(x) <= 2.0)) ||
				((y <= 0) && (y >= -3.0) && (Math.abs(x) <= 4.0))) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
