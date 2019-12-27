package Shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return (2 * Math.PI) * radius;
    }

    @Override
    public int getTotalAngels() {
        return 0;
    }
}