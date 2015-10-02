package assignment7_04;

public class Student extends RealPerson implements Studying, Comparable{

	protected String name, FacultyName, UniversityName;
	protected int StudentID;
	
	public Student(String name, String FacultyName, String UniversityName, int StudentID) {
		super();
		this.name = name;
		this.FacultyName = FacultyName;
		this.UniversityName = UniversityName;
		this.StudentID = StudentID;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getStudentID() {
		return StudentID;
	}

	@Override
	public String getFacultyName() {
		return FacultyName;
	}

	@Override
	public String getUniversityName() {
		return UniversityName;
	}
	
	@Override
	public int compareTo(Object o) {
		Student student = (Student)o;
		if(this.StudentID > student.StudentID) {
			return 1;
		} 
		else if(this.StudentID < student.StudentID) {
			return -1;
		} 
		else {
			return 0;
		}
	}

}
