import java.io.File;
import java.io.IOException;

public class Main8 {
    public static void main(String[] args){
        File f = new File("test.txt");

        try {
            if(f.createNewFile()){
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("Error creating file");
        }
    }
}