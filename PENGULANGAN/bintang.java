import java.util.Scanner;

public class bintang {

    public static void piramid(int bintang) {
        if (bintang > 0) {
            piramid(bintang - 1);
            for (int i = 0; i < bintang; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Jumlah Baris: ");
            int bintang = scanner.nextInt();
            piramid(bintang);
        }
    }
}