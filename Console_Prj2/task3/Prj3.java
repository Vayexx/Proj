package Console_Prj2.task3;

import java.util.Random;
import java.util.Scanner;

public class Prj3 {
    //Создать класс BankAccount с полями
    //
    //сумму на счету
    //номер счета (уникальное значение)
    //процент на остаток (годовой процент)
    //Создайте метод printInfo для вывода информации о счетах на консоль.
    //
    //Создайте массив счетов на 10 элементов и заполните его рандомно. Не забудьте, что номер счета при этом не должен повторяться.
    //Создайте меню:
    //1. Вывести все счета
    //2. Вывести сумму на счете по номеру (юзер вводит номер)
    //3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода. Сделайте проверку, что баланса отправителя хватает для перевода
    //4. Найти счет с самым большим процентом на остаток (найти целый объект)
    //5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год. Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100
    //6. Выход
    public static void main(String[] args) {
        BankAccount[] arr = new BankAccount[10];
        int[] summ = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            summ[i] = rnd.nextInt(900) + 50;
        }
        int[] num = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            num[i] = rnd.nextInt(9) + 1;
        }
        int[] pers = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            pers[i] = rnd.nextInt(5) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            BankAccount acc = new BankAccount();
            acc.TotalCount = summ[i];
            acc.Number = num[i];
            acc.Persent = pers[i];
            arr[i] = acc;
        }
        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input != 6) {
            System.out.println("1. Вывести все счета\n" +
                    "    2. Вывести сумму на счете по номеру (юзер вводит номер)\n" +
                    "    3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода. Сделайте проверку, что баланса отправителя хватает для перевода\n" +
                    "    4. Найти счет с самым большим процентом на остаток (найти целый объект)\n" +
                    "    5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год. Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100\n" +
                    "    6. Выход");
            System.out.print("ENTER № :");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].printBankAccountInfo();
                    }
                }
                break;
                case 2: {
                    System.out.print("Enter Number : ");
                    int n = scn.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].Number == n) {
                            arr[i].printBankAccountInfo();
                        }
                    }
                }
                break;
                case 3: {
                    System.out.print("Enter Number sender: ");
                    int s = scn.nextInt();
                    System.out.print("Enter Number receipient: ");
                    int r = scn.nextInt();

                    int sender_index = -1;
                    int receip_index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].Number == r) {
                            receip_index = i;
                        }
                        if (arr[i].Number == s) {
                            sender_index = i;
                        }

                    }
                    if(sender_index != -1 && receip_index != -1){
                        System.out.print("Enter sum: ");
                        int sum = scn.nextInt();
                        if(sum <= arr[sender_index].TotalCount ){
                            //arr[sender_index].TotalCount -= sum;
                            arr[sender_index].TotalCount = arr[sender_index].TotalCount - sum;
                            arr[receip_index].TotalCount = arr[receip_index].TotalCount + sum;
                            System.out.println("Transfer completed");

                        }else{
                            System.out.println("Not enough balance");
                        }

                    }else{
                        System.out.println("one or more accounts not found");
                    }
                }
                break;
                case 4 : {
                    int max = arr[0].Persent;
                    int max_index = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i].Persent>max){
                            max = arr[i].Persent;
                            max_index = i;
                        }
                    }
                    arr[max_index].printBankAccountInfo();

                }
                break;
                case 5: {
                    double maxDohod = arr[0].getDohod();
                    int max_index = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i].getDohod() > maxDohod){
                            maxDohod = arr[i].getDohod();
                            max_index= i;
                        }
                    }
                    arr[max_index].printBankAccountInfo();

//                    double maxDohod = arr[0].TotalCount*arr[0].Persent/100;
//                    int max_index = 0;
//                    for (int i = 0; i < arr.length; i++) {
//                        if(arr[i].TotalCount * arr[i].Persent / 100 > maxDohod){
//                            maxDohod = arr[i].TotalCount * arr[i].Persent / 100;
//                            max_index= i;
//                        }
//                    }
//                    arr[max_index].printBankAccountInfo();

                }
            }
        }
    }
}



