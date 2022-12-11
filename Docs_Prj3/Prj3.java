package Docs_Prj3;

import scn.Input;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Prj3 {
    public static void main(String[] args) {
        ArrayList<Film> list = new ArrayList<>();
        list.add(new Film("Titanic", 1999, 125.5));
        list.add(new Film("ok", 2000, 115));
        list.add(new Film("Криминальное чтиво", 2001, 140));
        list.add(new Film("Мстители", 2018, 130));
        list.add(new Film("Однажды в Голливуде", 2019, 155));
        int input = 0;
        while (input != 4) {
            System.out.println("1. Добавить фильм в список фильмов (программа читает с консоли название, год и time).\n" +
                    "В список можно добавить новый фильм только в случае, если его еще нет в списке (то есть не должно быть повторов).\n" +
                    "2. Узнать длительность фильма (юзер вводит название и год выпуска, программа выводит time, если такой фильм есть)\n" +
                    "3. Вывести самый долгий фильм (вывести название, год и time с помощью toString)\n" +
                    "4. Выход");

            System.out.println();
            input = Input.nextInt();
            switch (input) {
                case 1 -> {
                    Film film1 = new Film (Input.next("Enter name: "), Input.nextInt("Enter year: "), Input.nextInt("Enter time: "));
                    if (!list.contains(film1)){
                        list.add(film1);
                    }else{
                        System.out.println("Фильм уже существует !!!");
                    }


                }
                case 2->{
                    int index = list.indexOf(new Film(Input.next("Enter name: "), Input.nextInt("Enter year: "), 0));
                    if (index != -1){
                        System.out.println(list.get(index).time);
                    }
                }
                case 3-> {
                    Film max = new Film("M",0,0);
                    for(Film film :list){
                        if (film.time >= max.time){
                            max = film;
                        }
                        System.out.println(max.toString());
                    }
                }

            }
        }
    }
}


class Film {
    String name;
    int year;
    double time;

    public Film(String name, int year, double time) {
        this.name = name;
        this.year = year;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return year == film.year && Objects.equals(name, film.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", time=" + time +
                '}';
    }
}

