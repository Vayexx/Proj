package Search_Prj1;

import java.util.Scanner;

public class Prj1 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String[] arr = new String[5];
//        for (int i = 0; i< arr.length ; i++){
//            System.out.println("Enter str : ");
//            arr[i] = scn.next();
//        }
            arr = new String[]{"one", "two", "three"};
            System.out.println("Strintg to compare: ");
            String str = scn.next();
            boolean exist = false;
            for (int i = 0; i < arr.length; i++) {
                if(str.equals(arr[i])){
                    exist = true;
                }
            }
            if(exist){
                System.out.println("Есть в массиве");
            }
            else{
                System.out.println("Нет");
            }
        }
    }

