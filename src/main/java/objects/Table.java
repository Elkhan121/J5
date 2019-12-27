package objects;


import com.google.gson.annotations.SerializedName;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Table {


    public int getHeight;
    private String name ;

     @SerializedName("manufactured")
     private Date manufactureDate;
     private Material material;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    private String colors[];

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int height;
    private int width;
    private int lenght;

    public Table(int height, int width, int lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

     void setHeight(int height) {
        this.height = height;
    }

     int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if(width <= 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("in setWidth method");
            this.width = width;

    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    int area(){
        int a = width * lenght;
        return a;

    }
    int volume(){
        int obem = width * lenght * height;
        return obem;
    }

    void print(){
        System.out.println("Размеры стола : " + name + " " + lenght  + " " +  height + " "+ width);
    }

    @Override
    public boolean equals(Object obj) {
        Table t = (Table)obj;

        if(width == t.width && height == t.height && lenght == t.lenght){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name +"[" + width + "x" + height + "x" + lenght + "]";
    }

    public void readSpecs() throws FileNotFoundException {
        Scanner in = new Scanner(new File("table.txt"));
    }
}
