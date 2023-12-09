import java.util.Arrays;

public class seleksyen {
    public static void main(String[] args) {
        int[] data = {45, 21, 52, 61, 9};
        System.out.println("Array asal: " + Arrays.toString(data));

        selectionSort(data);
        System.out.println("Array setelah disusun: " + Arrays.toString(data));
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int indexMin = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int temp = data[i];
                data[i] = data[indexMin];
                data[indexMin] = temp;
            }
        }
    }
}
