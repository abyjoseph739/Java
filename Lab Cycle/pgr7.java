import java.util.Scanner;
public class pgr7 {
    public static void main(String[]args) {
        Scanner af = new Scanner(System.in);

        System.out.println("Enter the Name :");
        String ag = af.nextLine();


        System.out.println("Enter the mark:");
        int m = af.nextInt();
        System.out.println("Name : "+ag);

        if (m >=90) {
            System.out.println("Status : A Grade");
        } else if (m>=80) {
            System.out.println("Status : B Grade");
        } else  if (m>=70){
            System.out.println("Status : C Grade");
        } else if (m>=60){
            System.out.println("Status : D Grade");
        } else if (m>=50) {
            System.out.println("Status : E Grade");
        } else {
            System.out.println("Status : Failed");
        }
    }
}