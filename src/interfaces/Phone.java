package interfaces;

public interface Phone {
//    Constant Field/attribut
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

//    Abstract method
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
