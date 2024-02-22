public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ahmad";
        person1.address = "Tangerang";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("AST");
        System.out.println();

        Person person2 = new Person();
        person2.name = "Sodrul";
        person2.address = "Demak";
        person2.sayHello("AST");
        System.out.println(person2.sayAddress());
    }
}
