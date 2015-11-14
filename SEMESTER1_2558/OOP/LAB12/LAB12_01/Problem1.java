import java.util.InputMismatchException;
import java.util.Scanner;


public class Problem1 {
	
	private static Scanner reader;

	public static void main(String[] args) {

		reader = new Scanner(System.in);
		
		int summation = 0;
		int temporary;
		
		System.out.print("Enter 5 values: ");
		for (int i = 0; i < 5; i++) {
			try {
				temporary = Integer.parseInt(reader.next());
				summation += temporary;
			} catch(NumberFormatException e) {
				
			}
		}
		
		System.out.print("Summary is " + summation);
	}
}
