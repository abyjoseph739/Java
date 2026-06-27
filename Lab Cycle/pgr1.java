import java.util.Scanner;
public  class pgr1  {
    public static void main(String[]args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the Name :");
        String n = io.nextLine();

        System.out.println("Enter the Roll No :");
        int r = io.nextInt();

        System.out.println("Enter the Course :");
        String c = io.next();

        System.out.println("Enter the Percentage: ");
        Double P = io.nextDouble();

        System.out.println("Name :"+n);
        System.out.println("Roll No :"+r);
        System.out.println("Course :"+c);
        System.out.println("Percentage :"+P);


    }
}