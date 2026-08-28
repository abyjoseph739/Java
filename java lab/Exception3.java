import java.util.Scanner;

import java.util.InputMismatchException;

class Exception3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int a;

	while(true) {

	try {

	System.out.print("Enter a number : ");

	a = sc.nextInt();

	break;

	}

	catch (InputMismatchException e) {

	System.out.println("Invalid input. Please enter an integer.");

	sc.next();

	}

	}

	}

}