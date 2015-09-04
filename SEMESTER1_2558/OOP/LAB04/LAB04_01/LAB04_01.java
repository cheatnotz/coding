package assignment4_01;
import kmitl.Student;

public class LAB04_01 {

	public static void main(String[] args) {
		//Create an object and use instance methods
		Student s1 = new Student();
		s1.name = "Alice";
		s1.gpa = 3.00;
		System.out.println(s1.getName() + " : " + s1.getGpa());
		
		//Create another object and use instance methods
		Student s2 = new Student();
		s2.name = "Bob";
		s2.gpa = 3.50;
		System.out.println(s2.getName() + " : " + s2.getGpa());
		
		//Using static method
		Student[] allStudents = new Student[2];
		allStudents[0] = s1;
		allStudents[1] = s2;
		double avgGpa = Student.calculateAverageClassGpa(allStudents);
		System.out.println("Average GPA = " + avgGpa);

	}

}