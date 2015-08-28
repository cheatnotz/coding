import java.util.ArrayList;
import java.util.Scanner;


public class LAB03_05 {

	public static void main(String[] args) {
		
		// Create list
		ArrayList studentID = new ArrayList();
		ArrayList Name = new ArrayList();
		
		// Input data to program
		for(int i = 1; i <= 5; i++)
		{
			Scanner reader1 = new Scanner(System.in);
			System.out.print("enter an ID (" + i + ")> ");
			String Data_StudentID = reader1.next();
			studentID.add(Data_StudentID);
			
			Scanner reader2 = new Scanner(System.in);
			System.out.print("enter an name (" + i + ")> ");
			String Data_Name = reader2.next();
			Name.add(Data_Name);
		}
		
		Scanner reader1 = new Scanner(System.in);
		System.out.print("enter an ID to search> ");
		String Data_Search = reader1.next();
		
		for(int i = 0; i <= 4; i++)
		{
			if(Data_Search.equals(studentID.get(i)))
			{
				System.out.println("found> " + Name.get(i));
				break;
			}
		}
	}

}
