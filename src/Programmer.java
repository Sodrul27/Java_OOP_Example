public class Programmer extends Person{
    String technology;

    void hacking(){
        System.out.println("I can hacking a website");
    }

    void coding(){
        System.out.println("I can create a application using technology : " + technology + ".");
    }

//    Method overreding pada child class programmer
    void greeting(){
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
        System.out.println("My occupation is a " + technology + " Programmer.");
    }
}
