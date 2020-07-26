
public class Code{
	public static void main(String[] args) {
//		System.out.println(factorial(16));
		Cat c = new Cat();
		Dog d = new Dog();
		c.bite();
		d.bite();
	}
	public static int factorial(int n) {
		if(n == 0 || n == 1) { // base case
			return 1;
		}
		return n * factorial(n-1);
	}
	
}
abstract class Animal{
	void bite() {}
	void drink() {}
	void eat() {}
}
class Cat extends Animal{
	@Override
	void bite() {
		System.out.println("Bite");
	}
	@Override
	void drink() {
		System.out.println("Drink");
	}
	@Override
	void eat() {
		System.out.println("Eat");
	}
}
class Dog extends Animal{
	@Override
	void bite() {
		System.out.println("Dog Bites");
	}
	@Override
	void drink() {
		System.out.println("Dog Drinks");
	}
	@Override
	void eat() {
		System.out.println("Dog Eats");
	}
}
abstract class Food{
	void color() {}
	void taste() {}
	void texture() {}
}
class Burger extends Food{
	@Override
	void color() {
		System.out.println("Burger has the normal Burger color");
	}
	@Override
	void taste() {
		System.out.println("Burger tastes good");
	}
	@Override
	void texture() {
		System.out.println("Burger has normal texture");
	}
}
class Pizza extends Food{
	@Override
	void color() {
		System.out.println("Pizza has normal color");
	}
	@Override
	void taste() {
		System.out.println("Pizza has normal taste");
	}
	@Override
	void texture() {
		System.out.println("Pizza has normal texture");
	}
}
