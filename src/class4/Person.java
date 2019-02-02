package class4;

class Human {
	void eat(Food f) {
		f.eat();
	}
	void eat(Food a, Food b) {
		a.eat();
		b.eat();
	}
}

public class Person {
	public void eatChocolate(Chocolate c) {
		System.out.println("Eating chocolate");
	}

	public void eatBiscuit(Biscuit b) {
		System.out.println("Eating Biscuit");
	}

	public void eatFruit(Fruit f) {
		System.out.println("Eating Fruit");
	}

	public static void main(String args[]) {
		Person p = new Person();
		Biscuit b = new Biscuit();
		Chocolate c = new Chocolate();
		Fruit f = new Fruit();
		p.eat(b);
		p.eat(c);
		p.eat(f);
		p.eat(c, b);
		p.eat(b, c);

	}

	public void eat(Chocolate c) {
		eatChocolate(c);
	}

	public void eat(Chocolate c, Biscuit b) {
		eatChocolate(c);
		eatBiscuit(b);
	}

	public void eat(Biscuit b, Chocolate c) {
		eatBiscuit(b);
		eatChocolate(c);
	}

	public void eat(Biscuit b) {
		eatBiscuit(b);
	}

	public void eat(Fruit f) {
		eatFruit(f);
	}

}

class Chocolate extends Food {
	void eat() {
		System.out.println("Eating chocolate");
	}
}

class Biscuit extends Food {
	void eat() {
		System.out.println("Eating biscuit");
	}
}
