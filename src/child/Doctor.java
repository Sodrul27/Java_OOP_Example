package child;

import parent.Person;

public class Doctor extends Person {
    private String specialist;

    public Doctor(){

    }

    public Doctor(String name, String address, String specialist){
        super(name, address); // ini adalah super constructor dari parent class
        this.specialist = specialist;
    }

    public void surgery(){
        System.out.println("I can surgery operation patients");
    }

//    Method overreding pada child class doctor
    public void greeting(){
       super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My occupation is a " + specialist + " child.Doctor.");
    }

    //    Encapsulation menggunakan getter dan setter
    public String getSpecialist() {
        return this.specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
