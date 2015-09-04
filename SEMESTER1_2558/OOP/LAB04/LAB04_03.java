package assignment4_03;

public class LAB04_03 {

	public static void main(String[] args) {
		// Create an object with instance methods
		System.out.println(readDigit(1));
		System.out.println(readDigit(7));
		System.out.println(readDigit("2"));
		System.out.println(readDigit("4"));
		System.out.println(readDigit(27));
		System.out.println(readDigit("14"));


	}

	public static String readDigit(int number) {
		switch(number){
			case 0: 
				return "zero";
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			default:
				return "unknown";
		
		}
	}
	
	public static String readDigit(String string){
		return readDigit(Integer.parseInt(string));
	}

}
