package Console_Prj2.task4;

import java.util.Random;
import java.util.Scanner;

public class Prj4 {
    public static void main(String[] args) {
        Order[] arr = new Order[5];
        Random rnd = new Random();
        String[] ord = {"tea", "coffee", "3", "4", "5"};//new String[5]
        for (int i = 0; i < arr.length; i++) {
            Order order = new Order();
            int nameIndex = rnd.nextInt(ord.length);
            order.order = ord[nameIndex];
            order.price = rnd.nextInt(1000) + 100;
            order.type = rnd.nextBoolean();
            arr[i] = order;
        }


        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input != 6) {
            System.out.println("1. Вывести все заказы (с помощью метода printOrderInfo)\n" +
                    "2. Вывести только заказы с ценой выше x (x вводится с консоли, используйте printOrderInfo для вывода заказа)\n" +
                    "3. Вывести только заказы с ценой в диапазоне от x до y (x,y вводится с консоли, используйте printOrderInfo для вывода заказа)\n" +
                    "4. Вывести только вегетарианские заказы (с помощью метода printOrderInfo)\n" +
                    "5. Вывести только НЕ вегетарианские закзаы (с помощью метода printOrderInfo)\n" +
                    "6. Выход");
            System.out.print("ENTER № :");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].printOrderInfo();
                    }
                }
                break;

                case 2: {
                    System.out.print("ENTER $: ");
                    int x = scn.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].price >= x) {
                            arr[i].printOrderInfo();
                        }
                    }
                }
                break;

                case 3: {
                    System.out.print("ENTER $ от: ");
                    int x = scn.nextInt();
                    System.out.print("ENTER $ до: ");
                    int y = scn.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].price >= x && arr[i].price <= y) {
                            arr[i].printOrderInfo();
                        }
                    }
                }
                break;

                case 4: {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].type == true) {
                            arr[i].printOrderInfo();
                        }
                    }
                }
                break;
                case 5: {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].type == false) {
                            arr[i].printOrderInfo();
                        }
                    }
                }
            }
        }
    }

}
