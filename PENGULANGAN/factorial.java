 public class factorial {
    public int getFaktorial (int angka){
        if (angka == 0) {
            return 1;
        }else{
            return angka * getFaktorial(angka - 1);
        }
    }
public static void main(String[] args) {
        Faktorial f = new Faktorial();
        System.out.println(f.getFaktorial(5));
    }
}
