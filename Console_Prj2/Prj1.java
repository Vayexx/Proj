package Console_Prj2;

import java.util.Scanner;

public class Prj1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] arr = new String[5];


        String input = "";
        int size = 0;
        while (!input.equals("5")) {
            System.out.println("1. Добавить покупку\n" +
                    "2. Вывести список покупок\n" +
                    "3. Вывести количество\n" +
                    "4. Удалить покупку\n" +
                    "5. Exit ");
            input = scn.next();

            switch (input) {
                case "1":
                    System.out.print("Enter product name: ");
                    String product = scn.next();
                    arr[size] = product;
                    size++;

                    break;
                case "2":
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println(size);
                    //или так,
//                    int count = 0;
//                    for (int i = 0; i < arr.length; i++) {
//                        if(arr[i] != null){
//                            count++;
//                        }
//                    }
//                    System.out.println(count);
                    break;
                case "4":
                    System.out.print("Enter index: ");
                    int index = scn.nextInt(); //0
                    arr[index] = null;
                    arr[index] = arr[size-1]; //смещаем последний элемент на позици, из которой сделали удаленпие
                    arr[size-1] = null;
                    size--;
                    break;

            }

        }
    }
}
