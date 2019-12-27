package Shapes;

public class RightTriangle extends Triangle{
    public RightTriangle(int base , int height){
        super(base , height);
    }




    public double getArea(){

        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
