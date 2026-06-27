import java.util.Scanner;
public  class pgr4 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Basic Salary: ");
        int p = io.nextInt();

        double DA = p*0.10;
        double HRA = p*0.15;
        double gs = p+DA+HRA;

        System.out.println("DA: "+DA);
        System.out.println("HRA: "+HRA);
        System.out.println("Gross Salary: "+gs);


    }
}