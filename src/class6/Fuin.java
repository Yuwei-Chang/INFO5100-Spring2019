package class6;

import java.util.Scanner;

public class Fuin {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		String a = s.nextLine();
		System.out.println("Enter second number");
		String b = s.nextLine();
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(a + " + " + b + " = " + c);
	}
}
