package class3;

public class Meal {
	Soup soup;
	Starter starter;
	Dish dish;
	Dessert dessert;
	int price;

	public void finalize() {
		System.out.println("Meal is over - needs to be cleaned up.");
	}

	void setSoup(String soupName) {
		soup.name = soupName;
	}

	void setStarter(String starterName) {
		starter.name = starterName;
	}

	void setDish(String dishName) {
		dish.name = dishName;
	}

	Meal() {
		soup = new Soup(null);
		starter = new Starter();
		dish = new Dish();
		dessert = new Dessert();
	}
	Meal(Soup soup){
		
	}
	Meal(Starter starter){
		
	}

	Meal(String soupName, String starterName) {
		this();
		/*
		 * soup = new Soup(); starter = new Starter(); dish = new Dish(); dessert = new
		 * Dessert();
		 */
		soup.name = soupName;
		starter.name = starterName;
		if (soupName.equals("Miso")) {
			price += 5;
		}
		if (starter.name.equals("Tempura")) {
			price += 10;
		}
	}

	Meal(String soupName, String starterName, String dishName) {
		this(soupName, starterName);
		setDish(dishName);
	}

	public String toString() {
		if (soup == null && starter == null && dish == null) {
			return "Soup, Starter and Dish are not ordered";
		}
		return "Soup -> " + soup.name + " : Starter -> " + starter.name + " : Dish -> " + dish.name;
	}

	public static void main(String args[]) {
		Meal larryMeal = new Meal();
		System.out.println(larryMeal);
		larryMeal.setSoup("Chicken Noddle Soup");
		larryMeal.setStarter("Hamburger");
		System.out.println(larryMeal);

		Meal charlieMeal = new Meal("Miso", "Tempura");
		System.out.println(charlieMeal);

		Meal amyMeal = new Meal("Miso", "Tempura", "Kung Pao Chicken");
		System.out.println(amyMeal);

		amyMeal = null;
		charlieMeal = null;
		Runtime.getRuntime().gc();
		System.out.println("Done");
	}
}

class Soup {
	String name;

	Soup(String name) {
		this.name = name;
	}

}

class Starter {
	String name;
}

class Dish {
	String name;
}

class Dessert {
}

class iPhone {
	int price;
	String version;
	String color;

	iPhone(int price, String version, String color) {
		this.price = price;
		this.version = version;
		this.color = color;
	}

}