package assignment4_04;

import java.util.Random;
import java.util.Scanner;

public class LAB04_04 {
	
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.print("Enter Your Password Length: ");
		int length = reader.nextInt();
		System.out.println("New Password = " + generatePassword(length));
	}

	public static String generatePassword(int length) {
		String value = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random generated = new Random();
		
		StringBuilder str_build = new StringBuilder(length);
		for(int i = 0; i < length; i++){
			str_build.append(value.charAt(generated.nextInt(value.length())));
		}
		return str_build.toString();
	}

}
