import java.util.Scanner;

public class pgr14 {

    public static void main(String[] args){

        Scanner c = new Scanner(System.in);

        System.out.println("Enter the number :");
        int p = c.nextInt();

        int count = 0;

        for(int i = 1; i <= p; i++){

            if(p % i == 0){
                count++;
            }

        }

        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}