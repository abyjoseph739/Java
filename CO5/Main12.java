import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args){
        try {
            File fl = new File("numbers.txt");
            if(fl.createNewFile()){
                System.out.println("File created");
            } else{
                System.out.println("File Already Exist");
            }
            PrintWriter pr = new PrintWriter(fl);
            pr.println(10);
            pr.println(20);
            pr.println(30);
            pr.println(40);
            pr.println(50);
            pr.close();

            Scanner ce = new Scanner(fl);
            int summ = 0;
            while (ce.hasNext()){
                int num = ce.nextInt();
                summ = num+summ;

                System.out.println(summ);
            }
            ce.close();
        }
        catch (FileNotFoundException f){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("File error");
        }
    }
}
