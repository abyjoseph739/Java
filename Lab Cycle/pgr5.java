import java.util.Scanner;
public  class pgr5 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the Value 1: ");
        int a = io.nextInt();

        System.out.println("Enter the Value 2: ");
        int b = io.nextInt();

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        double div = a/b;
        double mod = a%b;

        System.out.println("Addition :"+add);
        System.out.println("Subtraction :"+sub);
        System.out.println("Multiplication :"+mul);
        System.out.println("Division :"+div);
        System.out.println("Modulus :"+mod);

    }
}