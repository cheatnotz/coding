package assignment7_02;

public class RealPerson extends Person{
	protected String name;
	
	public RealPerson(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
