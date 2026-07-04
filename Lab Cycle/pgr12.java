import java.util.Scanner;
public class pgr12 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int s = n.nextInt();

        int[]arr = new int[s];
        System.out.println("Enter "+" Elements");
        for (int i =0;i<s;i++){
            arr[i] =n.nextInt();
        }
        int max =arr[0];
        for (int i =0;i<s;i++){
          if (arr[i]>max){
              max = arr[i];
          }
        }
        System.out.println("The largest element is :"+max);

    }
}