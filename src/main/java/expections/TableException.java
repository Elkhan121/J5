package expections;

import objects.Table;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TableException {

    public static void main(String[] args) {

//        Table t = new Table(0, 0, 0);
//
//        try {
//            t.readSpecs();
//            System.out.println("aaaaaaaaaa");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
////            t.setWidth(-32);
//            System.out.println("aaaaaaaaaa");
//        } catch (IllegalArgumentException ex) {
//            t.setWidth(1);
//        } finally {
//            System.out.println("aaaaaaaaaa");
//            System.out.println();
//        }
//        System.out.println(t.getWidth());

        try {
            FileReader in = new FileReader("a.txt");
            in.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
