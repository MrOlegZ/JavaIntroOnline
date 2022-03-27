package by.jonline.pr01.linear;

import java.util.Scanner;

//z = ((b + sqrt(b^2+4ac))/2a) - a^3c + b^(-2);

public class MyFunc02 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a: ");
		double a = sc.nextDouble();
		
		System.out.print("Input b: ");
		double b = sc.nextDouble();
		
		System.out.print("Input c: ");
		double c = sc.nextDouble();
		
		double D = Math.pow(b, 2) + 4*a*c;
		double z;
		
		if (D >= 0) {
			z = (b + Math.sqrt(D)) / (2*a) - (Math.pow(a, 3)*c) + Math.pow(b, -2);
			System.out.println("((" + b + " + sqrt(" + b + "^2 + 4*" + a + "*" + c + "))/2.0*" + a + ") - " + 
					a + "^3*" + c + " + " + b + "^(-2) = " + z);
		}
		else {
			System.out.println("Attempt to calculate the square root of a negative number");
		}
	}

}
