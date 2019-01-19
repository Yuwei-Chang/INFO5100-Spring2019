
public class Kid {

	public static void main(String[] args) {
		Kid kid = new Kid();
		kid.displayNumbers(5);
		kid.displayNumbers(4);
		kid.displayNumbersUsingLoops(100);
		kid.displayNumbersUsingLoopsExcludingMultiplesOfThree(10);
		kid.displayNumbersUsingLoopsExcludingMultiplesOfThreeInAnotherWay(10);
	}

	void displayNumbersUsingLoops(int maximumNumber) {
		System.out.println("Displaying numbers till " + maximumNumber);
		for (int start = 1; start <= maximumNumber; start = start + 1) {
			System.out.println(start);
		}
	}

	void displayNumbersUsingLoopsExcludingMultiplesOfThree(int maximumNumber) {
		System.out.println("Displaying numbers till " + maximumNumber + " without mutliples of 3");
		int start = 1;
		for (;;) {

			if (start > maximumNumber) {
				break;
			}
			if (start % 3 != 0) {
				System.out.println(start);
			}

			start = start + 1;
		}
	}

	void displayNumbersUsingLoopsExcludingMultiplesOfThreeInAnotherWay(int maximumNumber) {
		System.out.println("Displaying numbers till " + maximumNumber + " without mutliples of 3");

		for (int start = 1; start <= maximumNumber; start++) {
			if (start % 3 != 0) {
				System.out.println(start);
			}
		}
	}

	void displayNumbers(int maximumNumber) {
		System.out.println("I will display numbers upto " + maximumNumber);
		if (maximumNumber >= 1) {
			System.out.println("1");
		}
		if (maximumNumber >= 2) {
			System.out.println("2");
		}
		if (maximumNumber >= 3) {
			System.out.println("3");
		}
		if (maximumNumber >= 4) {
			System.out.println("4");
		}
		if (maximumNumber >= 5) {
			System.out.println("5");
		}

	}

}
