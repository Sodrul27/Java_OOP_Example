import child.Doctor;
import child.Programmer;
import child.Teacher;
import parent.Person;

public class MainApp {
    public static void main(String[] args) {


        Person person1 = new Programmer("Ahmad", "Tangerang", "Java"); // Object 1
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
            message = "Hello " + programmer.getName() + ". Seorang child.Programmer " + programmer.getTechnology() + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello " + doctor.getName() + ". Seorang Docter " + doctor.getSpecialist() + ".";
        } else {
            message = "Hello " + person.getName() + ".";
        }
        System.out.println(message);
    }
}
