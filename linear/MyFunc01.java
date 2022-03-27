package by.jonline.pr01.linear;

import java.util.Scanner;

// z = ((a - 3) * b / 2) + c;

public class MyFunc01 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a: ");		
		double a = sc.nextDouble();
		
		System.out.print("Input b: ");
		double b = sc.nextDouble();
		
		System.out.print("Input c: ");
		double c = sc.nextDouble();
		
		double z;
		
		z = ((a - 3.0) * b / 2.0) + c;
		
		System.out.println("((" + a + " - 3) * " + b + " / 2) + " + c + " = " + z);
	}

}
