import interfaces.Phone;

public class UserPhone {
    private Phone phone;

    public UserPhone(Phone phone){
        this.phone = phone;
    }

    public void turnOnThePhone(){
        this.phone.powerOn();
    }

    public void turnOffThePhone(){
        this.phone.powerOff();
    }

    public void makePhoneLouder(){
        this.phone.volumeUp();
    }

    public void makePhoneSilent(){
        this.phone.volumeDown();
    }

//    Getter dan setter

    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
