import java.util.Arrays;


public class LAB03_02 {

	public static void main(String[] args) {
		
		// Create a list
		int data[] = {88,51,8,49,0,89,21,52,99,39,18,88,79,11,22,12,32,62,94,2,84,34,19,42,48,56,88,76,90,40,75,
				44,46,30,36,12,79,39,14,49};
		
		// Function to sort a list
		Arrays.sort(data);
		
		for(int i = 0; i <= data.length - 1; i++)
		{
			if(i == data.length - 1)
				System.out.print(data[i]);
			else
				System.out.print(data[i] + ", ");
		}
	}

}
