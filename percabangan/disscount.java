import java.util.Scanner;
public class disscount {
    public static void main(String[] args) throws Exception {
        Double totalBelanja, disscount;

        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan total belanja: ");
            totalBelanja = inputan.nextDouble();
        }
        if (totalBelanja >= 100000) {
            disscount = totalBelanja * 50/100;
            totalBelanja = totalBelanja - disscount;
        }

        System.out.println("Total yang harus dibayar" + totalBelanja);
    }
}
