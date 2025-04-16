import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_and_Unchecked {
    public static void main(String[] args) throws FileNotFoundException {//throws FileNotFoundException{
       try{
            FileReader read=new FileReader("Example2.java");
       } catch (FileNotFoundException e) {
           e.getMessage();
           System.out.println("FILE NOT FOUND");
           throw new FileNotFoundException("Opps");
       }
    }
}
