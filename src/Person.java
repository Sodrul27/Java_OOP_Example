public class Person {
    String name;
    String address;
    final String country = "Indonesia";

//    Constructor Default
    Person(){

    }

//    Constructor dengan 1 Parameter
    Person(String paramName){
        name = paramName;
    }

//    Constructor dengan 2 parameter
    Person(String paramName, String paramAddress){
//        Memanggil constructor didalam constructor pertama
        this(paramName);
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name + ".");
    }

    String sayAddress(){
        return "I Come from " + address + ".";
    }
}
