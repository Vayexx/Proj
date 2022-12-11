package Console_Prj2;

import java.util.Scanner;

public class Prj2 {
    public static void main(String[] args) {
        //Создал класс Character (персонаж игры) с полями
        //
        //название персонажа
        //класс персонажа (войн, маг, лекарь)
        //урон персонажа
        Pers_Prj2[] arr = new Pers_Prj2[5];
        String[] names = {"Орк", "Лучник", "Воин", "Маг ", "Лекарь"};
        int[] powerArr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            Pers_Prj2 player = new Pers_Prj2(); //создаем объект класса Pers
            player.pers_type = names[i]; //присва
            player.power = powerArr[i];
            arr[i] = player;//сохраняем объект в ячейке массива
        }
        names[0]="killer";
        names[1]="killer2";



        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input != 7) {
            System.out.println("1. Вывести всю информацию (всю информацию о каждом персоонаже)\n" +
                    "2.  Юзер вводит с консоли требуемый класс персонажа, программа должна вывести из массива всех персонажей, чей класс совпадает с введенным с консоли. \n" +
                    "3. Юзер вводит с консоли урон, которым должен обладать персонаж. Выведите на консоль всех персонажей, чей урон больше или равен введенному с консоли\n" +
                    "4. Юзер вводит класс и урон. Выведите всех персонажей, чей класс совпадает с введенным и чей урон больше или равен введенном");
            input = scn.nextInt();
            switch (input) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].printPersInfo();
                    }
                    break;
                case 2: {
                    String type = scn.next(); //Ork
                    int i = 0;
                    while (i != 5) {
                        if (arr[i].pers_type.equals(type)) {
                            arr[i].printPersInfo();
                        }
                        i++;
                    }
                    break;
                }
                case 3:{
                    int power = scn.nextInt();
                    for (int i = 0; i < arr.length ; i++) {
                        if (arr[i].power >= power){
                            arr[i].printPersInfo();
                        }
                    }
                    break;
                }
                case 4:{
                    String type = scn.next();
                    int power = scn.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].power >=power && arr[i].pers_type.equals(type)) {
                            arr[i].printPersInfo();
                        }
                    }
                    break;
                }



            }
        }
    }

}


