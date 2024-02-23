import javax.print.Doc;

public class MainApp {
    public static void main(String[] args) {
//        Membuat Objek Dari class Parent Person
//        Menggunakan cunstructor default
        Person person1 = new Person();
        person1.name = "Ahmad";
        person1.address = "Tangerang";

//        Membuat Objek Dari class child Teacher
//        Menggunakan cunstructor default
        Teacher teacher1 = new Teacher();
        teacher1.name = "Sodrul";
        teacher1.address = "Karang Tengah";
        teacher1.subject = "Java Programming";

//        Menggunakan cunstructor super
        Teacher teacher2 = new Teacher("Hisyam", "Tangerang", "Multimedia");

//        Membuat Objek Dari class child Doctor
//        Menggunakan cunstructor default
        Doctor doctor1 = new Doctor();
        doctor1.name = "Tamam";
        doctor1.address = "Jakarta";
        doctor1.specialist = "Dentis";

//        Menggunakan cunstructor super
        Doctor doctor2 = new Doctor("Mufa", "Demak", "Bedah");

//        Membuat Objek Dari class child Programmer
//        Menggunakan cunstructor default
        Programmer programmer1 = new Programmer();
        programmer1.name = "Odru";
        programmer1.address = "Demak";
        programmer1.technology = "Java";

//        Menggunakan cunstructor super
        Programmer programmer2 = new Programmer("Rika", "Surabaya", "Javascript");

//        Implementasi method parent class
        person1.greeting();
        System.out.println();

        teacher1.greeting();
        System.out.println("====================");
        teacher2.greeting();
        System.out.println();

        doctor1.greeting();
        System.out.println("====================");
        doctor2.greeting();
        System.out.println();

        programmer1.greeting();
        System.out.println("====================");
        programmer2.greeting();
    }
}
