package Inheritance;

public class Rectangular extends Shape{

    String name;

    Rectangular(String name , int widht , int height){
        super(widht , height);
        this.name = name;

//        setWidht(widht);
//        setHeight(height);
    }
//
//    Rectangular(String name , int widht){
//        super(widht);
//        this.name = name;



    Rectangular(String name , int width){
        this(name , width , width);
    }

    void showName(){
        System.out.println("Name of rectangular: " + name);
    }

    boolean isSquare(){
        return getHeight() == getWidht();

//        if(getHeight() == getWidht()){
//            return true;
//        } else {
//            return false;
//        }

    }

}
