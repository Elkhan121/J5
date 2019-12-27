package objects;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();



        FileReader r = new FileReader("out2.txt");

        Table t = gson.fromJson(r ,Table.class);
        t.print();
        System.out.println(t.getManufactureDate());
        t.getColors();


        for(String color : t.getColors()){
            System.out.println(color);
        }
    }
}
