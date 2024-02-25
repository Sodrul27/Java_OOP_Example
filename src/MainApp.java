import javax.print.Doc;

public class MainApp {
    public static void main(String[] args) {


        Person person1 = new Programmer("Ahmad", "Tangerang", "Java"); // Object 1
        /*
        bila ingin mengambil field pada child class tapi menggunakan type data
        parent class maka perlu dilakukan Type check & Casts seperti dibawah.
        */
        System.out.println(((Programmer)person1).technology);


        Person person2 = new Teacher("Mufa", "Demak", "B.Inggris"); // Object 2
        Person person3 = new Doctor("Sodrul", "Parung", "Bedah"); // Object 3

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);

    }

    /* Metod sayHello
        yang didalamnya terdapat pengecekan, dengan kondisi melakukan pengecekan
        tipe data atau lebih tepatnya pengecekan instantiation apa yang digunakan
        pembuatan object.
        Dengan menggunakan instanceof, apakah object tersebut di instansiasi oleh
        masing-masing class
     */
    static void sayHello(Person person){
        String message;
        if(person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Hello " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello " + doctor.name + ". Seorang Docter " + doctor.specialist + ".";
        } else {
            message = "Hello " + person.name + ".";
        }
        System.out.println(message);
    }
}
