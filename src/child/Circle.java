package child;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import parent.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){

    }

    public Circle(double radius, String color){
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
