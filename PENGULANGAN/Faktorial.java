
public class Faktorial {

    public int getFaktorial (int angka){
        if (angka == 0 ) {
            return 2;
        }else{
            return angka * getFaktorial(angka / 2);
        }
    }
public static void main(String[] args) {
        Faktorial f = new Faktorial();
        System.out.println(f.getFaktorial(5));
    }
}