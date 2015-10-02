package assignment7_03;

public class Problem3 {

	public static void main(String[] args) {
		Student Student1 = new Student("Banz", "Information Technology", "KMITL", 57070007);
		Student Student2 = new Student("Nuttat", "Information Technology", "KMITL", 57070052);
		Student Student3 = new Student("Nungning", "Information Technology", "KMITL", 57070064);
		
		// call methods
		System.out.print("Student1: ");
		System.out.println(String.format("%s(%d) is studying in %s, %S", Student1.getName(), Student1.getStudentID(), Student1.getFacultyName(), Student1.getUniversityName()));
		
		System.out.print("Student2: ");
		System.out.println(String.format("%s(%d) is studying in %s, %S", Student2.getName(), Student2.getStudentID(), Student2.getFacultyName(), Student2.getUniversityName()));

		System.out.print("Student3: ");
		System.out.println(String.format("%s(%d) is studying in %s, %S", Student3.getName(), Student3.getStudentID(), Student3.getFacultyName(), Student3.getUniversityName()));
	}

}
