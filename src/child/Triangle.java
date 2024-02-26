package child;

import parent.Shape;

public class Triangle extends Shape {
    private double alas;
    private double tinggi;

    public Triangle(){

    }

    public Triangle(double alas, double tinggi, String color){
        setColor(color);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getArea(){
        double area = 0.5 * alas * tinggi;
        return area;
    }
}
