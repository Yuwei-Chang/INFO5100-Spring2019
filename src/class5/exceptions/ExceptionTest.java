package class5.exceptions;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		playTheSumGame();

	}

	private static void playTheSumGame() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter yes, if you want to play else exit to break");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				System.out.println("DONE playing sum game");
				break;
			}
			addTwoNumbersElegantly(scanner);
		}

	}

	private static void addTwoNumbersElegantly(Scanner scanner) {
		int a = getNumber(scanner, "Enter first number");
		int b = getNumber(scanner, "Enter second number");
		int s = a + b;
		System.out.println(a + " + " + b + " = " + s);

	}
	
	//2.935 - 3.382

	private static int getNumber(Scanner scanner, String message) {
		while (true) {
			System.out.println(message);
			try {
				int x = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("You didn't provide me a number. Please enter a number");
			}
		}
	}

	private static void addTwoNumbers(Scanner scanner) {
		System.out.println("Enter First Number");
		String first = scanner.nextLine();
		System.out.println("Enter Second Number");
		String second = scanner.nextLine();
		int a;
		try {
			a = Integer.parseInt(first);
			System.out.println("Good input");
		} catch (Exception e) {
			System.out.println("Bad Input");
			System.out.println("Your first input is not a number. I'm considering your first input as 15");
			a = 15;

		}

		int b;
		try {
			b = Integer.parseInt(second);
		} catch (Exception e) {
			System.out.println("Your second input is not a number. I'm considering your second input as 15");
			b = 15;
		}
		int s = a + b;
		System.out.println(a + " + " + b + " = " + s);

	}

}
