import java.io.File;

class Filehandling {

	public static void main (String[] args) {

	File file = new File("students.txt");

	if (file.exists()) {

		System.out.println("File Found");

	}

	else {
	
		System.out.println("File not Found");

	}


	}

}