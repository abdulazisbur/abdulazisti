import java.util.ArrayList;
import java.util.Scanner;

public class IPMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan semester: ");
        int semester = scanner.nextInt();

        ArrayList<String[]> matkul = new ArrayList<>();
        matkul.add(new String[]{"Nilai Dasar Shalih Akram", "3.00"});
        matkul.add(new String[]{"Teologi Aswaja", "3.50"});
        matkul.add(new String[]{"Civic Education", "3.50"});
        matkul.add(new String[]{"Ulumul Qur'an", "3.50"});
        matkul.add(new String[]{"Sejarah Pemikiran dan Keuangan Perbankan", "3.50"});
        matkul.add(new String[]{"Bahasa Arab I", "3.50"});
        matkul.add(new String[]{"Bahasa Inggris I", "3.50"});
        matkul.add(new String[]{"Pengantar Ekonomi Mikro", "3.50"});
        matkul.add(new String[]{"Manajemen Syariah", "3.50"});
        matkul.add(new String[]{"Pengantar Filsafat", "3.50"});
        matkul.add(new String[]{"Bahasa Indonesia", "3.50"});
        matkul.add(new String[]{"IP Semester", "3.25"});
        matkul.add(new String[]{"SKS Maksimal yang bisa diambil semester depan", "23"});

        int sksTotal = 0;
        double ipKumulatif = 0;
        System.out.println("IPMahasiswa untuk " + namaMahasiswa + " semester " + semester + ":");
        for (String[] data : matkul) {
            System.out.println(data[0] + " - " + data[1]);
            sksTotal += Integer.parseInt(data[1]);
            ipKumulatif += Double.parseDouble(data[0]) * Double.parseDouble(data[1]);
        }
        System.out.println("SKS Total: " + sksTotal);
        System.out.println("IPK: " + ipKumulatif / sksTotal);
    }
}
