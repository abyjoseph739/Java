import java.util.Scanner;

public class pgr13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int A = sc.nextInt();

        System.out.print("Enter B value: ");
        int B = sc.nextInt();


        System.out.println("\nBefore Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println("\nAfter Swap");
        System.out.println("A = " + B);
        System.out.println("B = " + A);
    }
}