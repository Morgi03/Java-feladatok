package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tomb = new int[5];
        System.out.println("Kérem adjon meg 5 egész számot: ");
        tomb[0] = sc.nextInt();
        sc.nextLine();
        tomb[1] = sc.nextInt();
        sc.nextLine();
        tomb[2] = sc.nextInt();
        sc.nextLine();
        tomb[3] = sc.nextInt();
        sc.nextLine();
        tomb[4] = sc.nextInt();
        sc.nextLine();

        System.out.println("A tömb, a megadás sorrendjében: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }

        System.out.println("A tömb fordított sorrendben: ");
        for (int i = tomb.length - 1; i > 0; i--) {
            System.out.println(tomb[i]);
        }
        System.out.println("A tömb minden második eleme: ");
        for (int i = 1; i < tomb.length; i += 2) {
            System.out.println(tomb[i]);
        }

        System.out.println("Kérem adjon meg egy számot 1 és 5 között: ");
        int helyiertek = sc.nextInt();
        System.out.println("A tömb eleme az adott helyiértéken: " + tomb[helyiertek-1]);
    }
}
