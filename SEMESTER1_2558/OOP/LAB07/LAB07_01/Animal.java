package assignment7_01;

	abstract class Animal{
		public Animal(){
			System.out.println("An animal has been created.");
		}
		
		public abstract void eat();
		public abstract void fly();
	}