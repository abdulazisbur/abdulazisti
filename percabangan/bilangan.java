import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) throws Exception {
        try (/* menghitung bilngn ganjil/genap */
        Scanner inputan = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int number = inputan.nextInt();
            
            if (number % 2 == 0){
                System.out.println("bilangan genap");
            } else {
                System.out.println("bilangan ganjil");
            }
        }
       
    }
}