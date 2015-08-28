import java.util.ArrayList;
import java.util.Scanner;


public class LAB03_03 {
	

	public static void main(String[] args) {
		
		// Create a list
		ArrayList storage = new ArrayList();
		
		int sum = 0;
		
		// Input data to program
		Scanner reader = new Scanner(System.in);
		System.out.print("Input your character: ");
		String data = reader.next();
		
		// Starting
		for(int i = 0; i <= data.length() - 1; i++)
		{
			storage.add(data.charAt(i));
			sum += data.charAt(i) - 64;
		}
		
		// Print Output
		System.out.print(data + " = ");
		for(int i = 0; i <= storage.size(); i++)
		{
			if(i == storage.size())
				System.out.print(i + " = " + sum);
			else
				System.out.print(i + " + ");
		}
		
	}
	

}
