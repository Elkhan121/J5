package Inheritance;

public class FigureTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setHeight(14);
        s.setWidht(10);

        s.showDimens();

        Shape s2 = new Shape();
        s2.showDimens();

       new Shape(33).showDimens();

       s2 = new Shape (45 , 55);
       s2.showDimens();


        Rectangular r1 = new Rectangular("My box" ,25, 25);
        r1.setHeight(15);
        r1.setWidht(25);
        r1.name = "My box";
        r1.showDimens();
        r1.showName();
        System.out.println("Square = " + r1.isSquare());

        Rectangular r2 = new Rectangular("My box" ,25,25);
        r2.setHeight(15);
        r2.setWidht(15);
        r2.name = "My box";
        r2.showDimens();
        r2.showName();
        System.out.println("Square = " + r2.isSquare());

        new Rectangular("New box", 99).showDimens();

        Shape ss = new Rectangular("obj" , 34);
        ss.showDimens();

        System.out.println(ss);
    }

}
