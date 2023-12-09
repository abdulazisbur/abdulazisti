public class practice{
    public static void main(String[] args) throws Exception{ 
        int[] arr = {3,1,9,2,3,3,4,0,-1,10,8,8,7,4,8};
        int k = -1;
        
        for (int i = 0; i < arr.length; i++) {
            k = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (k % j <= 3) {
                    int temp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    arr[k % 3] = temp + arr[j] * 2;
                } else {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp + arr[j & 6];
                }
                System.out.println(arr [k]);
        }
}
    

     }   
}
