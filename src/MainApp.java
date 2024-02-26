import child.Circle;
import child.Triangle;
import parent.Shape;

public class MainApp {
    public static void main(String[] args) {
//        menggunakan tipe yang sama tetapi di instansiasi menggunakan child class yang berbeda
        Shape lingkarang = new Circle(20, "Blue");
        Shape segitiga = new Triangle(10,20, "Red");

        System.out.println("Luas lingkaran berwarna " + lingkarang.getColor() + " adalah "
                + lingkarang.getArea());
        System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah "
         + segitiga.getArea());


    }
}
