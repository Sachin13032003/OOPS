package OOPS;
// throws keyword is used to give  the indication of exception to the caller method
// we declaire the throws keyword with the method -->
// void readfile() throws FileNotFoundException
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Keyword {
    public static void main(String[] args) {
        Read r= new Read();
        try {
            r.readfile();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("hello");
        
    }
    
}
class Read{
    void readfile() throws FileNotFoundException{
        FileInputStream fis =new FileInputStream("index.html");
    }
}
