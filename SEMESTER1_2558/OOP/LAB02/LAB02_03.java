package assignment2_03;

public class LAB02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1, max = 9;
		for(int i = 1; i <= 10; i++)
		{
			// {for} looping to create triangle space
			for(int j=i;j>1;j--)
			{
                System.out.print(" ");
            }
			
			// {for} looping to create number and print out to console
			System.out.print("0");
			for(int k = 1; k <= max; k++)
			{
				System.out.print(k);
			}
			
			// {for} looping like previous coding, but in decrase
			for(int k = max - 1; k >= 1; k--)
			{
				System.out.print(k);
			}
			
			// Check if line == 10; break the operation immediately
			if(i == 10){
				break;
			}
			else{
				System.out.println("0");
			}
			max -= 1;
		}
	}

}
