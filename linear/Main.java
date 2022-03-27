package by.jonline.pr01.linear;

import java.util.Scanner;

// Main class of the linear programs

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
				
		System.out.println("This is the block of linear programs.");
		System.out.print("Please, make your choise (enter number 1...6): ");
		
		while(!sc.hasNextInt()){
			sc.nextLine();
			System.out.print("Enter valid number (1...6): ");
		}
		
		int choise = sc.nextInt();
		
		switch (choise) {
		case 1:
			System.out.println("First program:");
			by.jonline.pr01.linear.MyFunc01.main(null);
			break;
		case 2:
			System.out.println("Second program:");
			by.jonline.pr01.linear.MyFunc02.main(null);
			break;
		case 3:
			System.out.println("Third program:");
			by.jonline.pr01.linear.MyFunc03.main(null);
			break;
		case 4:
			System.out.println("Fourth program:");
			by.jonline.pr01.linear.MyFunc04.main(null);
			break;
		case 5:
			System.out.println("Fifth program:");
			by.jonline.pr01.linear.MyFunc05.main(null);
			break;
		case 6:
			System.out.println("Sixth program:");
			by.jonline.pr01.linear.MyFunc06.main(null);
			break;
		default:
			System.out.println("Your choise is not valid");
			break;
		}
	}

}
