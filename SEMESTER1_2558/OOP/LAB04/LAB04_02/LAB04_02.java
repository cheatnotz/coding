package assignment4_02;
import kmitl.Student;

public class LAB04_02 {
	
	public static void main(String[] args) {
		//Create another object and use instance methods
		Student s3 = new Student();
		s3.setName("Charlie");
		System.out.println(s3.getName());
		s3.setName("");
		System.out.println(s3.getName());
		
		s3.setGpa(2.0);
		System.out.println(s3.getGpa());
		s3.setGpa(20);
		System.out.println(s3.getGpa());
	}

}
