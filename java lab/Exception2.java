import java.util.Scanner;

import java.util.InputMismatchException;

class Exception2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	try {

	System.out.print("Enter first number : ");

	int a = sc.nextInt();

	System.out.print("Enter Second number : ");

	int b = sc.nextInt();

	double total = a / b;

	System.out.println("Result : " + total);

	}

	catch (ArithmeticException e) {

	System.out.println("Division by zero is not possible");

	}

	}

}

