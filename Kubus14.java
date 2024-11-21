public class Kubus14 {
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi*sisi);
    }
    public static void main(String[] args) {
        int sisi = 4;
        int vol = hitungVolume(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi +" adalah: " + vol);
        int LPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi +" adalah: " + LPermukaan);

    }
}
