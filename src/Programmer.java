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
        super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My occupation is a " + technology + " Programmer.");
    }
}
