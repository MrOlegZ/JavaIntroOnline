package by.jonline.pr01.linear;

import java.util.Scanner;

//z = ((sin(x) + cos(y))/(cos(x)-sin(y)))*tg(x*y);

public class MyFunc03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input x: ");
		double x = sc.nextDouble();
		
		System.out.print("Input y: ");
		double y = sc.nextDouble();
		
		double z;
		
		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y); 
		System.out.println("((sin(" + x + ") + cos(" + y + "))/(cos(" + x + ")-sin(" + y + ")))*tg(" + x + " * " + y + ") = " + z);
		
	}

}
