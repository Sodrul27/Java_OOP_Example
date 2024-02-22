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
//        Penamaan nama parameter dan nama fiel sama, sehingga terjadi shadowing variable
//        Gunakan keyword this untuk solving
        this.name = name; //this.name ini menunjukan field name adalah dari class person itu sendiri.
        this.address = address; // this.address ini menunjukan field address adalah dari class person itu sendiri.
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name + ".");
    }

    String sayAddress(){
        return "I Come from " + address + ".";
    }
}
