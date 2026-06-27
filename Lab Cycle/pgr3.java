import java.util.Scanner;
public  class pgr3 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the Value 1: ");
        int p = io.nextInt();

        System.out.println("Enter the Value 2: ");
        int r = io.nextInt();

        System.out.println("Enter the Value 3:");
        int t = io.nextInt();

        double avg = (p+r+t)/3;

        System.out.println("Average :"+avg);
    }
}