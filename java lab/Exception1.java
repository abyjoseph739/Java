import java.util.Scanner;
import java.util.InputMismatchException;

// Custom exception for negative age
class NegativeAgeException extends Exception {
    NegativeAgeException(String message) {
        super(message);
    }
}

class ageEntry {
    int age;

    void SetAge() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Your Age: ");
            age = sc.nextInt();

            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative: " + age);
            }

            System.out.println("Age entered successfully: " + age);
        }//try block ends here
        catch (InputMismatchException e) { //built-in exception
            System.out.println("Enter a numeric value: " + e.getMessage());
        }
        catch (NegativeAgeException e) {  //user-defined (custom) exception
            System.out.println("Invalid age: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }


        finally { // executes after a try , after executing any catch block
            sc.close();
            System.out.println("Scanner closed");
        }
    }//void SetAge()
} //class ageEntry

class Exception1 {
    public static void main(String[] args) {
        ageEntry ag = new ageEntry();
        ag.SetAge();
    }
}
