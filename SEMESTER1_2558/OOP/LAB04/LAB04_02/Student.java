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


	public void setName(String name){
		if(name.length() > 0)
			this.name = name;
		else
			System.out.println("Error : Name is empty");
	}
	
	public void setGpa(double gpa){
		if(gpa > 0.00 && gpa < 4.00)
			this.gpa = gpa;
		else
			System.out.println("Error " + gpa + " is not in GPA range (0.0 - 4.0)");
	}


}


