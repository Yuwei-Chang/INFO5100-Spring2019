package class4;

class Parent {
	float money;

}

class Child {
	float money;

}

public class Grocery {

	public static void main(String[] args) {
		System.out.println("Banana is getting created");
		Banana b = new Banana(1.24f);
		// b.weight = 2;

		System.out.println("Banana is created");
		// b.setPrice(1.24f);
		b.eat();
		Orange orange = new Orange();
		orange.weight = 2;
		orange.setPrice(0.54f);
		orange.eat();
		Apple a = new Apple();
		a.weight = 0.5f;
		System.out.println(b.getDiscount());
		System.out.println(orange.getDiscount());
		System.out.println(a.getDiscount());
		a.eat();

	}

}

class Food {

	Food() {
		System.out.println("I'm Food");
	}

	void eat() {
	}

}

class Fruit extends Food {
	private float price;
	private String color;
	float weight;

	Fruit() {
		System.out.println("I'm Fruit");
	}

	Fruit(float price) {
		System.out.println("Fruit constructor with price -> " + price);
		this.price = price;
	}

	public void setPrice(float f) {
		this.price = f;
	}

	public void eat() {
		System.out.println("that has price -> " + getPrice() + ": color -> " + color + " : weight -> " + weight
				+ " Is Heavy -> " + isHeavy());
	}

	public void eatAgain() {
		System.out.println("Eat " + getFruitName() + " " + "that has price -> " + getPrice() + ": color -> " + color
				+ " : weight -> " + weight + " Is Heavy -> " + isHeavy());
	}

	public String getFruitName() {
		return "Fruit";
	}

	private boolean isHeavy() {
		if (weight > 1) {
			return true;
		}
		return false;
	}

	public float getPrice() {
		return price;
	}

	public float getDiscount() {
		return 0.1f;
	}

}

class Banana extends Fruit {

	public String getFruitName() {
		return "Banana";
	}

	Banana() {
		System.out.println("I'm Banana");
	}

	Banana(float price) {
		super(price);

	}

	boolean hasPeel;

	// float price;
	public void eat() {
		// System.out.println("Eat Banana that has price -> " + getPrice());

		System.out.print("Eat Banana ");
		super.eat();
	}

}

class Orange extends Fruit {
	public float getDiscount() {
		float d = super.getDiscount();
		return d + 0.10f;
	}

	public void eat() {
		System.out.print("Eat Orange ");
		super.eat();
	}

	public String getFruitName() {
		return "Orange";
	}

}

class Apple extends Fruit {

	@Override
	public float getDiscount() {
		return 0;
	}

	public void eat() {
		System.out.print("eat Apple ");
		super.eat();
	}

	private boolean isHeavy() {
		if (weight > 0.25f) {
			return true;
		}
		return false;
	}

}