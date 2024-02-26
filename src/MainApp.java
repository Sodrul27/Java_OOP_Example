import interfaces.Phone;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
//        Membuat object phone menggunakan instansiasi dari class xiaomi
        Phone redmiNote10 = new Xiaomi();

//        Membuat Object Phone celuler
        UserPhone ahmad = new UserPhone(redmiNote10);

//        Nyalakan dulu HP
        ahmad.turnOnThePhone();

//        Membuat tampilan
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("=========Aplikasi Interface========");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("===================================");

            System.out.println("Pilih aksi : ");
            aksi = input.next();

            if (aksi.equalsIgnoreCase("1")){
                ahmad.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                ahmad.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                ahmad.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                ahmad.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                isLooping = false;
            } else {
                System.out.println("Aksi yang dipilih tidak tersedia");
                System.out.println("Silahkan pilih aksi kembali");
            }
        } while (isLooping);

    }
}
