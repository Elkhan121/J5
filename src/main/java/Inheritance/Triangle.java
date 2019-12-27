package Inheritance;

public class Triangle extends Shape {

    public Triangle(int widht, int height) {
        super(widht, height);
    }

//    @Override
//    double getArea() {
//        return super.getArea();
//    }

    double getArea() {
        System.out.println("Shape.getArea()");
        return getHeight() * getWidht() / 2;
    }
}
