public class Doctor extends Person{
    String specialist;

    public Doctor(){

    }

    public Doctor(String name, String address, String specialist){
        super(name, address); // memanggil field dari parent class
        this.specialist = specialist;
    }

    void surgery(){
        System.out.println("I can surgery operation patients");
    }

//    Method overreding pada child class doctor
    void greeting(){
       super.greeting(); // Memanggil method dari parent atau person class
        System.out.println("My occupation is a " + specialist + " Doctor.");
    }
}
