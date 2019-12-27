package Shapes;

public abstract class Shape {
    private String name;

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract int getTotalAngels();

    @Override
    public String toString() {
        return "Shape{" +
                "area='" + getArea() + '\'' +
                '}';
    }
}
