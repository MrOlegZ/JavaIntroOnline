package by.jonline.pr01.linear;

import java.util.Scanner;

//Integer T (in seconds) present as HHс MMмин SSс

public class MyFunc05 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input past time in seconds: ");
		long T = sc.nextLong();
		
		long HH = T / 3600;
		long MM = (T % 3600) / 60;
		long SS = (T % 3600) % 60;
		
		System.out.println(T + "с = " + HH + "ч " + MM + "мин " + SS + "с");
		
		
	}

}
