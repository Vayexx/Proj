package Search_Prj1;

import java.util.Random;

public class Prj6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] arr = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = rnd.nextInt(20)-10;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0]; //в качестве начального значения берем любое число из массива (желтаельно первое)
        int min = arr[0][0];
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
