package assignment7_03;

public class Student extends RealPerson implements Studying{

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

}
