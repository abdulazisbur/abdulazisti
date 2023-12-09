import java.util.ArrayList;
import java.util.Scanner;

public class IPSemester {

    public static void main(String[] args) {
        ArrayList<String> kodeMatkul = new ArrayList<>();
        ArrayList<String> namaMatkul = new ArrayList<>();
        ArrayList<Integer> sksMatkul = new ArrayList<>();
        ArrayList<String> nilaiMatkul = new ArrayList<>();
        ArrayList<Integer> nilaireal = new ArrayList<>(); 

        // Mata kuliah dengan kode, nama matkul, sks, dan nilai
        kodeMatkul.add("PS0101"); namaMatkul.add("nilai dasar shalih akram"); sksMatkul.add(2); nilaiMatkul.add("B"); nilaireal.get(70);
        kodeMatkul.add("PS0102"); namaMatkul.add("Teknologi Aswaja"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(83);
        kodeMatkul.add("PS0104"); namaMatkul.add("Civic education"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(88);
        kodeMatkul.add("PS0201"); namaMatkul.add("Ulumul Quran"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(80);
        kodeMatkul.add("PS0203"); namaMatkul.add("Sejarah pemikiran dan keuangan perbankan"); sksMatkul.add(2); nilaiMatkul.add("B+");nilaireal.get(79);
        kodeMatkul.add("PS0205"); namaMatkul.add("Bahasa Arab I"); sksMatkul.add(2); nilaiMatkul.add("B-"); nilaireal.get(68);
        kodeMatkul.add("PS0207"); namaMatkul.add("Bahasa Inggris I"); sksMatkul.add(2); nilaiMatkul.add("B"); nilaireal.get(73);
        kodeMatkul.add("PS0209"); namaMatkul.add("Pengantar ekonomi mikro"); sksMatkul.add(3); nilaiMatkul.add("A-"); nilaireal.get(82);
        kodeMatkul.add("PS0218"); namaMatkul.add("Manajemen Syariah"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(84);
        kodeMatkul.add("PS0227"); namaMatkul.add("Pengantar Filsafat"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(83);
        kodeMatkul.add("PS0416"); namaMatkul.add("Bahasa Indonesia"); sksMatkul.add(2); nilaiMatkul.add("A-"); nilaireal.get(80);
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Semester: ");
            int semester = input.nextInt();

            System.out.println("\nDaftar Nilai Mata Kuliah Semester " + semester + " untuk " + nama);
            System.out.println("======================================================================");
            System.out.println("No. | Kode MK | Mata Kuliah | SKS | Huruf muthu | Bobot| Nilai |");
            System.out.println("----------------------------------------------------------------------");

            double totalSKS = 0;
            double totalNilai = 0;
            double totalBobot = 0;
            double totalIP = 0;

            for (int i = 0; i < kodeMatkul.size(); i++) {
                if (semester >= (i+1)) {
                    String kode = kodeMatkul.get(i);
                    String Matkul = namaMatkul.get(i);
                    int sks = sksMatkul.get(i);
                    String nilai = nilaiMatkul.get(i);
                    double bobot = sks * 1.5;
                    int angka = nilaireal.get(i);

                    System.out.println((i+1) + "   | " + kode + " | " + Matkul + " | " + sks + " | " + nilai + " | " + bobot + " | " + angka);

                    totalSKS += sks;
                    totalNilai += sks * getNilaiBobot(nilai);
                    totalBobot += bobot;
                    totalIP += angka;
                }
            }

            System.out.println("======================================================================");
            System.out.println("Jumlah SKS: " + totalSKS);
            System.out.println("IP Semester: " + getIPSemester(totalIP,  totalSKS));
            System.out.println("SKS Maksimal yang bisa diambil semester depan: " + totalSKS);
        }
    }
    public static double getNilaiBobot(String nilai) {
        double bobot = 0;
        switch (nilai) {
            case "A": bobot = 4.0; break;
            case "A-": bobot = 3.50; break;
            case "B+": bobot = 3.0; break;
            case "B": bobot = 2.5; break;
            case "B-": bobot = 2.0; break;
            case "C+": bobot = 1.5; break;
            case "C": bobot = 1.0; break;
            case "D": bobot = 0.5; break;
            case "E": bobot = 0.0; break;
        }
        return bobot;
    }

    public static double getIPSemester(double totalIP, double totalSKS) {
        return totalIP / totalSKS;
    }
}