
public class House {

	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		Student student = new Student();
		student.eatBreakfast(fridge);
		fridge.hasFruit = true;
		student.eatBreakfast(fridge);
		fridge.hasBread = true;
		System.out.println("-----");
		student.eatBreakfast(fridge);
		fridge.hasMilk = true;
		System.out.println("-----");
		student.eatBreakfast(fridge);

	}

}

class Student {
	void eatBreakfast(Fridge fridge) {
		boolean pancakeCombination = fridge.hasMilk && fridge.hasBread;
		if (pancakeCombination == true) {
			System.out.println("Make Pancake as the Fridge has milk and bread");
			return;
		}
		if (fridge.hasMilk) {
			System.out.println("Make Cereal as I have milk");
			return;
		}
		if (fridge.hasBread) {
			System.out.println("Make a Toast as the Fridge has Bread");
			return;
		}
		if (fridge.hasFruit) {
			System.out.println("Eat Fruit as the Fridge has fruit");

		} else {
			System.out.println("There is nothing in the fridge. I can't eat");
		}
	}
}

class Fridge {
	boolean hasMilk;
	boolean hasBread;
	boolean hasFruit;
}