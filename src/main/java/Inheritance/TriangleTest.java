package Inheritance;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Random;

public class TriangleTest {
    public static void main(String[] args) {


        Triangle t = new Triangle(10, 20);
        System.out.println("Area of triangle = " + t.getArea());

        Rectangular r = new Rectangular("Rectangular", 90, 80);
        System.out.println("Area of rectangular = " + r.getArea());

        Shape s = new Shape(70, 50);
        System.out.println("Area of Shape = " + s.getArea());

        Shape s3 = new Triangle(60, 50);
        System.out.println("Area of Shape = " + s3.getArea());
//
        Shape array[] = new Shape[3];
        array[0] = new Shape(21, 21);
        array[1] = new Rectangular("erty", 32, 23);
        array[2] = new Triangle(55, 32);
//
//         double d = 0;


        Shape shapes[] = new Shape[100];
        Random r1 = new Random();

        for (int i = 0; i < array.length; i++) {
   //         shapes[i] = r1.nextInt(100);

//
        }
        int type = r1.nextInt(100);

        switch (type) {
            case 1:
                shapes[0] = new Triangle(r1.nextInt(100), r1.nextInt(100));
                break;
            case 2:
                shapes[1] = new Shape(r1.nextInt(100), r1.nextInt(100));
                break;
            case 3:
                shapes[2] = new Rectangular("ertyu", (r1.nextInt(100)), r1.nextInt(100));
                break;
        }
    }
}

//        System.out.println(array[0].getArea());
//        System.out.println(array[1].getArea());
//        System.out.println(array[2].getArea());

