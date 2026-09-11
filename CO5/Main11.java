import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args){


        try {
            File fc = new File("student.txt");
            if(fc.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
            PrintWriter pr = new PrintWriter("student.txt");
            pr.println("Name : Aby");
            pr.println("Course : MCA");
            pr.println("Semester : 3");
            pr.close();

            Scanner c = new Scanner(fc);
            while (c.hasNextLine()){
                String line = c.nextLine();
                System.out.println(line);
            }
            c.close();
        } catch (FileNotFoundException f){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("File error");
        }
    }
}
