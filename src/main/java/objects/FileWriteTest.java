package objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;

public class FileWriteTest extends Throwable {
    public static void main(String[] args) throws FileNotFoundException {
        Table table = new Table( 21, 21, 21);
            table.setHeight(80);

        table.setManufactureDate(Calendar.getInstance().getTime());
        table.setColors(new String[]{
                "red","yellow","black"
        });
        table.setMaterial(new Material("metal", "wood"));

            GsonBuilder builder = new GsonBuilder();
            builder.setDateFormat("dd-MM-YYYY  HH:mm:ss");
            builder.setPrettyPrinting();

            Gson gson = builder.create();
        //Gson gson = new Gson();
        String result = gson.toJson(table);
        System.out.println(result);


        PrintWriter out = new PrintWriter("out2.txt");

//        out.println(table.getHeight());
//        out.println(table.getWidth());
//        out.println(table.getLenght());

        out.println(result);
        out.close();
        }
    }


