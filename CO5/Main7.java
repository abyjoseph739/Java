import java.io.File;
public class Main7 {
    public static void main(String[] args){
        File file = new File("test.txt");
        if(file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File does not exist");
        }
    }
}