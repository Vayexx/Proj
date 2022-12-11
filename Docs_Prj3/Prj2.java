package Docs_Prj3;

import java.util.Scanner;

public class Prj2 {
    public static void main(String[] args) {
        Comment [] arr = new Comment[10];
        int arrIndex = 0;
        int index = 0;

        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input !=9){
            System.out.println("1. Добавить комментарий (пользователь вводит с консоли имя автора, текст)\n" +
                    "2. Поставить лайк комментарию под индексом (пользователь вводит индекс комментария)\n" +
                    "3. Поставить дизлайк под индексом\n" +
                    "4. Очистить все нецензурные комментарии\n" +
                    "5. Вывести все комментарии\n" +
                    "6. Вывести текст и имя автора самого популярного комментария\n" +
                    "7. Вывести текст и имя автора самого непопулярного комментария\n" +
                    "8. Удалить комментарий автора (пользователь вводит имя автора. нужно не просто приравнять к null, а удалить его коммент из массива, но с сохранением размера самого массива)\n" +
                    "9. Выход");
            System.out.println( "Enter № :");
            input = scn.nextInt();
            switch (input){
                case 1 ->  {
                    System.out.println("Enter name : ");
                    String name = scn.next();
                    System.out.println("Enter comment : ");
                    String comm = scn.next();
                    arr[arrIndex] = new Comment(name , comm );
                    arrIndex++;
                }
                case 2 ->  {
                    System.out.println("Enter index : ");
                    index = scn.nextInt();
                    //arr[index].likes++;
                    arr[index].addLike();
                }
                case 3 ->  {
                    System.out.println("Enter index : ");
                    index = scn.nextInt();
                    //arr[index].dislikes++;
                    arr[index].addDislike();

                }
                case 4 ->  {
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]!=null) {
                            arr[i].cleanNegativeText();
                        }
                    }
                }
                case 5 ->  {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null){
                            arr[i].print();
                        }

                    }
                }
                case 6 ->  {
                    int maxLikes =0;
                    int maxIndex =0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null && arr[i].likes>=maxLikes){
                            maxLikes=arr[i].likes;
                            maxIndex=i;
                        }
                    }
                    arr[maxIndex].print();
                }
                case 7 -> {
                    int maxDislikes = 0;
                    int maxIndex =0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null && arr[i].likes<=maxDislikes){
                            maxDislikes=arr[i].likes;
                            maxIndex=i;
                        }
                    }
                    arr[maxIndex].print();

                }
                case 8 -> {
                    String name = scn.next();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null && name.equals(arr[i].autorsName)){
                            arr[i] = arr[arrIndex-1];
                            arr[arrIndex-1] = null;
                            arrIndex--;
                            System.out.println("deleted");
                            break;
                        }

                    }
                }

            }
        }

    }
}

class Comment {
    String autorsName;
    String commentText;
    int dislikes;
    int likes;

    public Comment(String autorsName, String commentText){
        this.autorsName= autorsName;
        this.commentText= commentText;

    }
    public void cleanNegativeText(){
        if (this.commentText.equals("Плохой коммент")){
            this.commentText ="";
        }
    }
    public void print (){
        System.out.println(autorsName +" "+commentText + " "+ likes+ " ");
    }
    public  void addLike (){
        this.likes ++;
    }
    public  void addDislike (){
        this.dislikes ++;
    }
}


