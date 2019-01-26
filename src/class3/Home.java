package class3;

public class Home {

	public static void main(String[] args) {
		Kid kid = new Kid("Rishaan");
		System.out.println(kid);
		PlayGround pg = new PlayGround();
		pg.play(kid);
		kid.setAge(1);
		System.out.println(kid);
		kid.setAge(2);
		System.out.println(kid);
		kid.setAge(100);

	}

}

class PlayGround {
	void playOld(Kid kid) {
		// String kidsName = kid.name;
		kid.play();

		// kid.name = "John";
		/*
		 * if (kid.name.equals(kidsName)) {
		 * 
		 * } else { throw new RuntimeException("Some one change kids name to -> " +
		 * kid.name); }
		 */
	}

	void play(Kid kid) {
		kid.play();
		System.out.println(kid.getName() + " is happily playing in the park");
	}

}

class DayCare {

}