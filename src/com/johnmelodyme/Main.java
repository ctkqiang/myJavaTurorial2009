/*
* THIS IS MY FIRST EXPERIENCE ON JRE JAVA PROGRAMMING
* JOHN MELODY MELISSA
 */

package com.johnmelodyme;
import java.awt.*;
import java.lang.String;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 34;
        float anotherNumber = number / 2; // 1.223234234F for longer digits or use "double"
        char letter = 'a';
        Date now = new Date(); // press enter automatic import java.util.Date
        System.out.println(number);
        System.out.println("This is the second one: \t " + anotherNumber);
        System.out.println("This is a \" char \" : " + letter);
        System.out.println("TIME: " + now); // or now.getTime()

        byte x = 10;
        byte y = 20;
        System.out.println(x + y / x - y);

        Point point1 = new Point(x = 1, y = 1);
        point1.x = 2;
        System.out.println(point1);

        String message = "Something something something" + " whatever!";
        boolean b = message.endsWith("<<< END WITH....");
        System.out.println(message.length() + "\n" + message.toUpperCase());
        //USER INPUT:  import java.util.Scanner (auto press alt + enter)::
        Scanner name = new Scanner(System.in);
        System.out.println("$User_input: " + name.nextLine());

        // Logical operators:
        //Scanner age = new Scanner(System.in); **
        int age = 23;
        int weight = 60;
        System.out.println("HI");

        //Switch statement:
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Day One");
                break;

            case 2:
                System.out.println("Day Two");
                break;

            case 3:
                System.out.println("Day three");
                break;

            case 4:
                System.out.println("Day four");
                break;
        }
        // Default switch:
        int qwerty = 33;
        switch (qwerty) {
            case 11:
                System.out.println("Less than 10");
                break;
            case 22:
                System.out.println("More than 10");
                break;
            default:
                System.out.println("This is default");
        }
        // While loop:
        int a = 10;
        while (a < 20) {
            System.out.println("Damn");
            a++;
        }
        //for loop:
        for (int B = 1; B <= 10; B++) {
            System.out.println(B);
        }
        for (int T = 1; T <= 10; T = T + 2) {
            System.out.println(T);
        }
        // Enhanced for loop:
        int[] primenumbers = {2, 3, 5, 7};
        for (int P : primenumbers) {
            System.out.println("Prime Numbers: " + P);
        }
        //do while loop:
        int L = 1;
        do {
            System.out.println(L);
            L++;
        } while (L <= 5);

        // ARRAY:
        String[] names = {" \"Shalini\" ", " \"Sabrina\" ", " \"Kavya\" "};
        System.out.println(names[2]);
        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names.length);
        // Multi-dimensional:
        int[][] threeDArray = {{1, 3, 5, 7, 9}, {2, 4, 6, 8}};
        int f = threeDArray[0][1];
        int ff = threeDArray[1][3];
        System.out.println(f + ff);

        //Access Modifiers: Protected, Private, public
        class whatever {
            private int h = 1;
            private String name = "whatevername";

            public void shit() {
                System.out.println("Whatever");
            }
        /*
        CONSTRUCTOR == SAME NAME AS THE { CLASS }
         */
        }
        class ExampleClass {
            public static final double PI = 3.142;
            protected int shit;

            public void main(String[] args) {
                System.out.println(PI);
            }
        }
    }
    class animal{
        public void makesound(){
            System.out.println("PURR");
        }
    }
    class cat extends animal{
        public void makesound(){
            System.out.println("Meow~");
        }
    }
    /*ENUMs:
    enum Rank{
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    Rank a = Rank.SOLDIER;
    switch(a){
        case SOLDIER:
            System.out.println("soldier");
            break;
        case SERGEANT:
            System.out.println("SEARGANT");
            break
        case CAPTAIN:
            System.out.println("CAP");
    }
     */
}