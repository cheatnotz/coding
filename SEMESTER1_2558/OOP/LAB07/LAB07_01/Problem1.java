package assignment7_01;

public class Problem1 {

	public static void main(String[] args) {
		//1.instantiate an abstract class
		//Animal redHawk = new Animal();
		
		//2.instantiate Eagle and Parrot
		Eagle americanEagle = new Eagle();
		Parrot americanParrot = new Parrot();
		
		//3.Eagle is an Animal?
		if(americanEagle instanceof Animal){
			System.out.println("americanEagle is an instance of Animal");
		}
		if(americanEagle instanceof Eagle){
			System.out.println("americanEagle is an instance of Eagle");
		}
		
		//4.try if Eagle and Parrot is an Animal
		Animal anAnimal = americanEagle;
		
		//5.Eagle is an Animal?
		if(anAnimal instanceof Animal){
			System.out.println("anAnimal is an instance of Animal");
		}
		if(anAnimal instanceof Eagle){
			System.out.println("anAnimal is an instance of Eagle");
		}
		
		
		
		
		//6.try calling the methods
		americanEagle.eat();
		americanEagle.fly();
		anAnimal.eat();
		anAnimal.fly();
		
		americanParrot.eat();
		americanParrot.fly();
		americanParrot.train();

	}

}
