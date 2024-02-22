public class MainApp {
    public static void main(String[] args) {
//        Membuat object dari class Person menggunakan Constructor 2 Parameter
        Person person1 = new Person("Ahmad", "Tangerang");
        person1.sayHello("AST");
        System.out.println(person1.sayAddress());


        System.out.println();


//        Membuat object dari class Person menggunakan Constructor Default
        Person person2 = new Person();
        person2.name = "Sodrul";
        person2.address = "Demak";
        person2.sayHello("AST");
        System.out.println(person2.sayAddress());

        
        System.out.println();


//        Membuat object dari class Person menggunakan Constructor 1 Parameter
        Person person3 = new Person("Tamam");
        person3.address = "Jakarta";
        person3.sayHello("AST");
        System.out.println(person3.sayAddress());

    }
}
