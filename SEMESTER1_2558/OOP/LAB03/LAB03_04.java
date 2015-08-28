import java.util.ArrayList;
import java.util.Scanner;

public class LAB03_04 {

	public static void main(String[] args) 
	{
		
		// Create a list
		ArrayList storage = new ArrayList();
		int count = 0;
		while (true)
		{
			Scanner reader = new Scanner(System.in);
			System.out.print("enter a word(\"quit\" to stop)> ");
			String data = reader.next();
			if (data.equals("quit"))
				break;
			
			storage.add(data);
		}
		
		for(int i = 0; i < storage.size()/2; i++)
		{
			System.out.println(storage.get(count) + " = " + storage.get(count + 1));
			count += 2;
		}
	}

}
