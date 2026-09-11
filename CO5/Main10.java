import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args){
        try{
            File f = new File("test.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}