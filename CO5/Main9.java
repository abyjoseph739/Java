import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main9 {
    public static void main(String[] args){

        try{
            PrintWriter p = new PrintWriter("test.txt");
            p.println("Name : Aby");
            p.println("Course : MCA");
            p.close();
            System.out.println("Data written successfully");
        }
        catch (IOException e){
            System.out.println("File error");
        }
    }
}