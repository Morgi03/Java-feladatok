package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív egész számot: ");
        int num = sc.nextInt();
        int osszeg = 0;
        for (int i = 1; i < num; i+=2) {
            osszeg+= i;
        }
        System.out.printf("A bekért számnál nem nagyobb pozitív páratlan számok összege: %d", osszeg);
    }
}
