package assignment7_01;

class Eagle extends Animal implements Bird{
	public Eagle(){
		super();
		System.out.println("A eagle has been created.");
	}
	
	public void eat(){
		System.out.println("This eagle eats snakes.");
	}
	
	public void fly(){
		System.out.println("This eagle can fly.");
	}
}

