import java.util.Scanner;
public class pgr11 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num = n.nextInt();

        int sum = 0;
        int temp = num; 
        
        while (temp !=0) {
            int digit = temp%10;
            sum = digit + sum;
            temp = temp/10;
        }
        System.out.println(sum);
    }
}