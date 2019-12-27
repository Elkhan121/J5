package Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(8);
        Shape rect = new Rect(10,20);
        Shape triangle = new RightTriangle(10,20);

        System.out.println(circle.getPerimeter());
        System.out.println(triangle.getPerimeter());
        System.out.println(rect.getPerimeter());

    }

}
