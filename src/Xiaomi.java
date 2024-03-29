import interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        this.volume = 50;
    }

    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone Menyala....");
        System.out.println("Selamat Datang Di Xiomi");
        System.out.println("Android Version 10");
    }

    public void powerOff(){
        isPowerOn = false;
        System.out.println("Mematikan Handphone");
    }

    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume sudah Maximal");
                System.out.println("Volume " + this.volume + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang " + this.volume);
            }
        }else {
            System.out.println("Handphone Mati, Silahkan Nyalakan dulu!!!");
        }
    }

    public void volumeDown(){
        if(isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume " + this.volume + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume Sekarang " + this.volume);
            }
        } else {
            System.out.println("Handphone Mati, Silahkan Nyalakan dulu!!!!");
        }
    }

//    Getter dan Setter
    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }
}
