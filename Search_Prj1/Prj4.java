package Search_Prj1;

import java.util.Arrays;
import java.util.Random;

public class Prj4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[7];
        arr[0] = rnd.nextInt(100);
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        //int min = arr[0];
        //int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
                maxIndex=i;

            }
            if (arr[i] < min){
                min = arr[i];
                minIndex=i;
            }

        }
        int temp =arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
