package assignment4_05;

import java.util.Scanner;

public class LAB04_05 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter your value: ");
		int value = input.nextInt();
		System.out.print(solve(value));
	}

	private static double solve(int value) {
		return Math.sqrt(((Math.pow(value, 2))/2) - 4);
	}
}
