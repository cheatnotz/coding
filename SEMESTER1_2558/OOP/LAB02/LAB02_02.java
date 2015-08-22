package assignment2_02;

import java.util.Scanner;

public class LAB02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Syntax for input data from I/O
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		
		// Keep data to variable
		int stop = input.nextInt();
		
		int count = 1;
		
		// Looping with {do...while} structure
		for (int i= 1; i <= stop; i += 2)
		{
			System.out.print(i + " ");
		}
	}

}
