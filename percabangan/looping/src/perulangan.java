public class perulangan {
    public static void main(String[] args) {
        for (int i = 10; i > 0 ;i--) {
             System.out.println("Saya tidak akan Telat " + i);
        }


        //foreach
        int[] numbers = {1, 2, 3 };
        for (int number : numbers ) {
            System.out.println(number);
        }

        String[] names = {"Putra", "ramdit", "memekes"};
        for (String name : names) {
            System.out.println(name);
        }
       
    }
}
