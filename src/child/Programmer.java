package child;

import parent.Person;

public class Programmer extends Person {
    public String technology;

    public Programmer(){

    }

    public Programmer(String name, String address, String technology){
        super(name,address); // ini adalah super constructor dari parent class
        this.technology = technology;
    }

    public void hacking(){
        System.out.println("I can hacking a website");
    }

    public void coding(){
        System.out.println("I can create a application using technology : " + technology + ".");
    }

//    Method overreding pada child class programmer
    public void greeting(){
        super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My occupation is a " + technology + " child.Programmer.");
    }
}
