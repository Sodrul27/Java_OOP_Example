public class Programmer extends Person{
    String technology;

    public Programmer(){

    }

    public Programmer(String name, String address, String technology){
        super(name,address); // ini adalah super constructor dari parent class
        this.technology = technology;
    }

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
