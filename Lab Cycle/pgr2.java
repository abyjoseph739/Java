import java.util.Scanner;
public  class pgr2 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the Principal: ");
        int p = io.nextInt();

        System.out.println("Enter the Rate: ");
        int r = io.nextInt();

        System.out.println("Enter the Time (Year's):");
        int t = io.nextInt();

        double SI = (p*r*t)/100;
        System.out.println("Simple Interest :"+SI);
        System.out.println("Amount :"+(p+SI));
    }
}