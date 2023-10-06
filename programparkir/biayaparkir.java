public class biayaparkir{
    public static void main(String[] args){
        int jamMasuk = 7;
        int jamKeluar = 16;
        int biayaPerjam = 2500;
        int total_jam_parkir = jamKeluar - jamMasuk;
        int Hasil = total_jam_parkir *  biayaPerjam; //perhitungan jam parkir

        System.out.println("selamat datang bestie");
        System.out.println("---------------------");
        System.out.println("biaya yang harus dibayar sebesar RP."+Hasil);

    }
}
