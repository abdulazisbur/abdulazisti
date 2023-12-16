

public class piramidabintang {
    static int b;
        public static void main(String[] args){
        b = 7;
        cetakpiramid(0);
    }
    static void cetakpiramid(int i){
        cetakspasi(0, i);
        cetakbintang(b, i);
        System.out.println();
        i++;
        if (i < b);
        {
            cetakpiramid(i);
        }
    }
    static void cetakspasi(int j, int i){
        if (j < b-i-1)
        {
            System.out.print(" ");
            cetakspasi(j+1,i);
        }
    }
    static void cetakbintang(int k, int i){
        if (k> b-i-1)
        {
            System.out.print("* ");
            cetakbintang(k+1, i);
        }
    }


}
