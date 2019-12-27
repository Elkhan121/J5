package Shapes;

import java.util.zip.CheckedInputStream;

public class Rect extends Shape {
    private int widht;
    private int lenght;

    public Rect(int widht, int lenght) {
        this.widht = widht;
        this.lenght = lenght;
    }

    public double getArea() {
        return widht * lenght;
    }

    public double getPerimeter() {
        return (widht + lenght) * 2;
    }

    @Override
    public int getTotalAngels() {
        return 0;
    }
}