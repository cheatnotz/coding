import java.util.Scanner;


public class Problem3 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {
		
		scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Input a string: ");
			String string = scanner.next();
			if (string.length() % 3 == 0) {
				throw new StringLongEnoughException("String length is divisible by 3");
			}
		}
	}
}