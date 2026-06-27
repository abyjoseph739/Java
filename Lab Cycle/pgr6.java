import java.util.Scanner;
public  class pgr6 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the Value : ");
        int a = io.nextInt();

        if (a%2 == 0){
            System.out.println(a+" is Even Number");
        } else{
            System.out.println(a+" is Odd Number");
        }

    }
}