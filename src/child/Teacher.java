package child;

import parent.Person;

public class Teacher extends Person {
    public String subject;

    public Teacher(){

    }

    public Teacher(String name, String address, String subject){
        super(name,address); // ini adalah super constructor dari parent class
        this.subject = subject;
    }
    public void teaching(){
        System.out.println("I can tech " + subject + ", so anyone how wants to learn can talk to me.");
    }

//    Method overreding pada child class child.Teacher
    public void greeting(){
        super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My job is a " + subject + " teacher.");
    }
}
