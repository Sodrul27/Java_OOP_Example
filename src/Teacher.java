public class Teacher extends Person {
    String subject;

    void teaching(){
        System.out.println("I can tech " + subject + ", so anyone how wants to learn can talk to me.");
    }

//    Method overreding pada child class Teacher
    void greeting(){
        super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My job is a " + subject + " teacher.");
    }
}
