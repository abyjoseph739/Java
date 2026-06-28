import java.util.Scanner;
public class pgr8 {
    public static void main(String[]args) {
        Scanner af = new Scanner(System.in);

        System.out.println("Enter value 1 :");
        int v1 = af.nextInt();

        System.out.println("Enter value 2 :");
        int v2 = af.nextInt();

        System.out.println("Enter value 1 :");
        int v3 = af.nextInt();

        if (v1>v2 && v1>v3) {
            System.out.println(v1+" is Greater");
        } else if (v2>v1 && v2>v3) {
            System.out.println(v2+" is Greater");
        }  else {
            System.out.println(v3+" is Greater");
        }
    }
}