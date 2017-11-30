package app1;

import java.util.Scanner;

public class SmartCalculator {

	public static void main(String[] args) {
		double x, y, z, a, b, c;
		System.out.println("Enter two integers to calculate");
		Scanner in = new Scanner(System.in);
		x = in.nextDouble();
		y = in.nextDouble();

		char operator = '/';

		switch (operator) {
		case '*':
			b = x * y;
			System.out.println("This is the answer " + b);
			break;
		case '/':
			c = x / y;
			System.out.println("This is the quotient " + c);
			break;
		case '+':
			z = x + y;
			System.out.println("This is the sum " + z);
			break;
		case '-':
			a = x - y;
			System.out.println("This is the difference " + a);
			break;
		}

	}
}