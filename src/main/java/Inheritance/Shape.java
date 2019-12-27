package Inheritance;

public class Shape {

    private int widht;
    private int height;

    public Shape() {
       widht = 1;
       height = widht;
    }

    public Shape(int widht) {
        this.widht = widht;
        height = this.widht;
    }

    public Shape(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }


    void showDimens() {
        System.out.println("widht = " + widht + "height = " + height);
    }

    void showDimens(boolean show){
        System.out.println("widht = " + widht + "height = " + height);
    }

    double getArea(){
        return widht * height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}