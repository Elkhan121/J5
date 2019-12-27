package objects;

import kz.codeforces.j5lib.TemteratureUtils;

public class TableTest {

    public static void main(String[] args) {
        Table t = new Table(12,32,43);
        t.setName("Table");
        t.setHeight(14);
        t.setWidth(43);
        t.setLenght(23);




        int s = t.area();
        t.print();
        System.out.println(" area2 = " + s);

            Table t2 = new Table(12,24,24 );
            t2.print();




            int s2 = t2.area();
        System.out.println(" area = " + s2);

        t.volume();
        int f = t.volume();
        System.out.println("volume : " + t.volume());

//
//        System.out.println("Размеры  2 стола : " + t2.height + " " +  t2.lenght + " " +  t2.width);
//
//            t2 = t;
//            t2.width = 77;


        double v = TemteratureUtils.toCelsious(22);
    }
}
