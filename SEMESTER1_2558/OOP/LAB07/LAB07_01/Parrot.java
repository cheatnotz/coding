package assignment7_01;

public class Parrot extends Animal implements Bird, Pet{

	@Override
	public void train() {
		System.out.println("This parrot can be trained.");
	}

	@Override
	public void eat() {
		System.out.println("This parrot eat anything you want.");
	}

	@Override
	public void fly() {
		System.out.println("This parrot can fly.");
	}

}
