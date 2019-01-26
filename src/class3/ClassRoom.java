package class3;

import java.util.Scanner;

public class ClassRoom {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Wallet wallet = new Wallet();
		System.out.println(wallet);
		while (true) {
			System.out.println("Tell me how much money you want..");
			int x = scanner.nextInt();
			if (x == 0) {
				System.out.println("I'm done taking money from the wallet");
				break;
			}
			// takeMoneyFromWallet(wallet, x);
			//wallet.money = wallet.money - x;
			int moneyGiven = wallet.giveMoney(x);
			System.out.println(wallet);
		}

	}

}
