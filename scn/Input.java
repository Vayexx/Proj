package scn;

import java.util.Scanner;


    public class Input {
        public static String next(){
            Scanner scn = new Scanner(System.in);
            return scn.next();
        }

        public static String next(String message){
            Scanner scn = new Scanner(System.in);
            System.out.print(message);
            return scn.next();
        }

        public static int nextInt(){
            Scanner scn = new Scanner(System.in);
            return scn.nextInt();
        }

        public static int nextInt(String message){
            Scanner scn = new Scanner(System.in);
            System.out.print(message);
            return scn.nextInt();
        }




    }


