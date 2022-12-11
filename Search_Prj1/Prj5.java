package Search_Prj1;

import java.util.Random;

public class Prj5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
            System.out.print(arr[i] + " ");


        }
        System.out.println();
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;

            }
        }
        int sum = 0;
        for (int i = 0; i < maxIndex; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
