package objects;

import java.util.Random;

public class TableArray {

    public static void main(String[] args) {
        Random r = new Random();
        int array[] = new int[10];
        Table tables[] = new Table[10];

        int counter = 0 ;
        int volume1 = 0;


        while(counter < tables.length){

            Table t = new Table(12,23,32);
            t.setHeight(200);
            t.setLenght(200);
            t.setWidth(200);

            int s = t.area();
            int v = t.volume();



            System.out.println("S = :" + s);
            System.out.println("Volume = : " + v);
            t.print();
            System.out.println("==========================");
            volume1 += v ;

            tables[counter] = t;

            counter++;
        }
            System.out.println("Общий объем = " + volume1);


            volume1 = 0;
        for (int i = 0; i < tables.length; i++) {
            Table t = tables[i];
            t.setWidth(23) ;
           volume1 += t.volume();
        }
        System.out.println("Новый объем = " + volume1);

        for (Table t : tables){
              t.setHeight(23);
              volume1 += t.volume();
        }
            System.out.println("Новый объем = " + volume1);


    }
}
