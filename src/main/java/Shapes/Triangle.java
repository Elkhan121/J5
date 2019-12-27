package Shapes;

public abstract class  Triangle extends Shape {

    public int base;
   public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
//
//        public double getPerimeter(){
//            return base + height * 2;
//        }

    public int getTotalAngels(){
        return 0;
    }
}

