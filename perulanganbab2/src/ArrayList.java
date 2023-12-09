
public class ArrayList {

    public static void main(String[] args) {

        // Definisikan kategori buku
        String[][] buku = {
                {"Buku 1", "Teknik"},
                {"Buku 2", "Kategori 2"},
                {"Buku 3", "Kategori 3"},
                {"Buku 4", "Kategori 4"},
                {"Buku 5", "Kategori 5"}
        };

        // Menampilkan seluruh buku dengan kategori
        System.out.println("Daftar Buku Perpustakaan Online:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". Judul: " + buku[i][0] + " - Kategori: " + buku[i][1]);
        }
    }
}

