public class MainApp {
    public static void main(String[] args) {
//        Membuat Objek Dari class Parent Person
        Person person1 = new Person();
        person1.name = "Ahmad";
        person1.address = "Tangerang";

//        Membuat Objek Dari class child Teacher
        Teacher teacher1 = new Teacher();
        teacher1.name = "Sodrul";
        teacher1.address = "Karang Tengah";
        teacher1.subject = "Java Programming";

//        Membuat Objek Dari class child Doctor
        Doctor doctor1 = new Doctor();
        doctor1.name = "Tamam";
        doctor1.address = "Jakarta";
        doctor1.specialist = "Dentis";

//        Membuat Objek Dari class child Programmer
        Programmer programmer1 = new Programmer();
        programmer1.name = "Odru";
        programmer1.address = "Demak";
        programmer1.technology = "Java";

//        Implementasi method parent class
        person1.greeting();
        System.out.println();

        teacher1.greeting();
        System.out.println();

        doctor1.greeting();
        System.out.println();

        programmer1.greeting();
    }
}
