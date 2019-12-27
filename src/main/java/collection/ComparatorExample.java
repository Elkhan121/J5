package collection;

import Shapes.*;
import objects.Table;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Table> tables = Arrays.asList(
                new Table(10, 20, 30),
                new Table(20, 40, 35),
                new Table(60, 40, 33),
                new Table(30, 20, 30),
                new Table(20, 25, 38));

        TableComparator myComp = new TableComparator();
        tables.sort(myComp);

        System.out.println(tables);

        tables.sort(new Comparator<Table>() {

            @Override
            public int compare(Table o1, Table o2) {
                if (o1.getLenght() == o2.getLenght()) {
                    return 0;
                } else if (o1.getLenght() < o2.getLenght()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println("==================");
        System.out.println(tables);

        List<Shape> shape = Arrays.asList(
                new RightTriangle(15,20),
                new Circle(15),
                new Rect(20,30)
                );
       shape.sort(new Comparator<Shape>() {
           @Override
           public int compare(Shape o1, Shape o2) {
               if (o1.getArea() == o2.getArea()) {
                   return 0;
               } else if(o1.getArea() < o2.getArea()) {
                   return -1;
               } else {
                   return 1;
               }
           }
       });
        System.out.println(shape);
    }
}