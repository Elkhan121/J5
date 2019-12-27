package expections;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResourceExample {
    public static void main(String[] args) {

        try(PrintWriter out = new PrintWriter("a.txt")){
            out.println("Hello world");

//            if(true){
//                throw new ArithmeticException();
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
