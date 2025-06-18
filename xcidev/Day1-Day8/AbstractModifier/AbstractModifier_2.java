package AbstractModifier;

abstract class Animal2{
	abstract void cry();
}

class Cat2 extends Animal2{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog2 extends Animal2{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}
}
