import java.util.Scanner;
public class pgr9 {
    public static void main(String[]args) {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        Scanner c = new Scanner(System.in);

        System.out.println("Enter your choice :");
        int n = c.nextInt();

        System.out.println("Enter Value 1 :");
        int x = c.nextInt();

        System.out.println("Enter Value 2 :");
        int y = c.nextInt();

        switch (n) {
            case 1:
                int a = x+y;
                System.out.println("Result = "+a);
                break;
            case 2:
                int s = x-y;
                System.out.println("Result = "+s);
                break;
            case 3:
                int m = x*y;
                System.out.println("Result = "+m);
                break;
            case 4:
                double d = x/y;
                System.out.println("Result = "+d);
                break;
            default:
                System.out.println("Invalid input");



        }
    }
}