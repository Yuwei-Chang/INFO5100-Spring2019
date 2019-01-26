package class3;

import java.util.Scanner;

public class Wallet {
	private int money = 100;

	public int giveMoney(int x) {
		if (x > money) {
			throw new RuntimeException(
					"I can't give you " + x + " dollars as I only have " + money + " dollars with me");
		}
		money = money - x;
		return x;
	}

	public String toString() {
		return "Money in Wallet -> " + money;
	}

}
