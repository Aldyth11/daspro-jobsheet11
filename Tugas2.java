public class Tugas2 {
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10},  
        {30, 80, 40, 10, 15, 20, 25},  
        {5, 9, 20, 25, 10, 5, 45},     
        {50, 8, 17, 18, 10, 30, 6},  
        {15, 10, 16, 15, 10, 10, 55}  
    };

    public static void tampilkanDataPenjualan() {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        System.out.println("Data Penjualan:");
        System.out.print("Menu \\ Hari  ");
        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Hari ke " + hari + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void penjualanHariTerakhir() {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        System.out.println("\nPenjualan Hari Terakhir (Hari ke 7):");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println(menu[i] + ": " + penjualan[i][6]);
        }
    }


    public static void makananterlaris() {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[] totalPenjualan = new int[penjualan.length];
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            totalPenjualan[i] = total;
        }
        int maxPenjualan = totalPenjualan[0];
        String menuTertinggi = menu[0];
        
        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > maxPenjualan) {
                maxPenjualan = totalPenjualan[i];
                menuTertinggi = menu[i];
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        System.out.println("Rata-rata Penjualan untuk setiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        tampilkanDataPenjualan();
        penjualanHariTerakhir();
        makananterlaris();
        rataRataPenjualan();
    }
}
