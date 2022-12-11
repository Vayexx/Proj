package Search_Prj1;

import java.util.Random;
import java.util.Scanner;

public class Prj2 {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int[] arr = new int [10];
        for (int i=0;i <arr.length; i++){
            arr[i]= rnd.nextInt(900)+100;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = scn.nextInt();
        System.out.println("Enter n: ");
        int n = scn.nextInt();
        for (int i=0;i < arr.length; i++){
            //arr[i]= rnd.nextInt(n-m)+m;
            if (arr[i] > m  && arr[i] < n) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
