import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

class Filehandling1 {

	public static void main(String[] args) {

	File file = new File("students.txt");

	try {

	Scanner sc = new Scanner(file);

	int count = 0;

	int n = 3;

	while (sc.hasNextLine() && count < n) {

	String line = sc.nextLine();

	System.out.println(line);

	count++;

	}

	sc.close();

	}

	catch (FileNotFoundException e) {

	System.out.println("File not found");

	}

	}

}