import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int category;
    private int year;

    public Book(String title, String author, String publisher, int category, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCategory() {
        return category;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%-4d| %-26s| %-17s| %-17s| %-6d| %-7s%n",
                    i+1, book.getTitle(), book.getAuthor(), book.getPublisher(), book.getYear(), getCategoryName(book.getCategory()));
        }
    }

    private String getCategoryName(int category) {
        switch (category) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            default:
                return "Lainnya";
        }
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku Tersedia");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            switch (choice) {
                case 1:
                    System.out.print("Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Pengarang: ");
                    String author = scanner.nextLine();
                    System.out.print("Penerbit: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Kategori (1-Teknik, 2-Manajemen, 3-Fiksi, 4-Lainnya): ");
                    int category = scanner.nextInt();
                    System.out.print("Tahun: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline character
                    Book book = new Book(title, author, publisher, category, year);
                    library.addBook(book);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    break;
            }
            System.out.println();
        } while (choice != 0);
        scanner.close();
    }
}


