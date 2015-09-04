package kmitl;

public class Student{
	public String name; //instance variable
	public double gpa; //instance variable
	
	public String getName(){
		return name;
	}

	public double getGpa(){
		return gpa;
	}
	
	public static double calculateAverageClassGpa(Student[] students){
		double sum = 0;
		for(Student std: students){
			sum += std.getGpa();
		}
		return sum/students.length;
	}

}


