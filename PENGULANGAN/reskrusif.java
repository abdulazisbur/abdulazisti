public class reskrusif {
    static void bilangan (int angka){
         if (angka <= 10) {
            System.out.print(angka + " ");
            bilangan(angka + 1);
         }
    }
     public static void main(String[] args) {
        bilangan (0);
    }
}
