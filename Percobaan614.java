import java.util.Scanner;

public class Percobaan614 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L=p*l;
        System.out.println("Luas Prsegi panjang adalah " + L);

        vol=p*l*t;
        System.out.println("Volume balok adlah "+ vol);
    }
    static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    static int hitungVolume(int tinggi, int panjang, int lebar) {
        int volume = hitungLuas(panjang, lebar) * tinggi;
        return volume;
    }
}
