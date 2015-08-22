package assignment2_05;

import java.util.Scanner;

public class LAB02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Syntax for input data from I/O
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your score: ");
				
		// Keep data to variable
		float score = input.nextFloat();
		
		if(score > 100){
			System.out.println("Failed, Please try again later.");
		}
		else{
			if(score >= 80){
				System.out.println("A");
			}
			else if(score >= 75){
				System.out.println("B+");
			}
			else if(score >= 70){
				System.out.println("B");
			}
			else if(score >= 65){
				System.out.println("C+");
			}
			else if(score >= 60){
				System.out.println("C");
			}
			else if(score >= 55){
				System.out.println("D+");
			}
			else if(score >= 50){
				System.out.println("D");
			}
			else{
				System.out.println("F");
			}
		}
	}

}
