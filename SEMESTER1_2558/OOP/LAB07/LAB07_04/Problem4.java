package assignment7_04;

import java.util.Arrays;

public class Problem4 {
	
	public static Student[] students;
	
	public static void main(String[] args) {
		students = new Student[3];
		students[0] = new Student("Banz", "Information Technology", "KMITL", 57070207);
		students[1] = new Student("Nuttat", "Information Technology", "KMITL", 570701052);
		students[2] = new Student("Nungning", "Information Technology", "KMITL", 57060064);
		
		Arrays.sort(students);
		
		for(Student student : students) {
			System.out.println(student.getStudentID());
			System.out.println(student.getName());
			System.out.println(student.getFacultyName());
			System.out.println(student.getUniversityName());
			System.out.println("");
		}
		

	}
}