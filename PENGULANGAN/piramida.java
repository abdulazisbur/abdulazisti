public class piramida {
    public static void main(String[] args) {
        int tinggi = 10; // Ganti dengan tinggi piramida yang diinginkan
        printPiramida(tinggi, 0);
    }

    public static void printPiramida(int tinggi, int baris) {
        if (tinggi == 0) {
            return;
        }

        printSpasi(tinggi - 1, baris);
        printBintang(baris);

        System.out.println();

        printPiramida(tinggi - 1, baris + 1);
    }

    public static void printSpasi(int spasi, int baris) {
        if (spasi == 0) {
            return;
        }

        System.out.print(" ");
    
        printSpasi(spasi - 1, baris);
    }

    public static void printBintang(int bintang) {
        if (bintang == 0) {
            return;
        }

        System.out.print("* ");

        printBintang(bintang - 1);
    }

}
