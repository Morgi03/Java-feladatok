package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a terület szélességét (m): ");
        double szelesseg = sc.nextDouble();
        System.out.print("Kérem adja meg a terület magasságát (m): ");
        double magassag = sc.nextDouble();
        double csempe = 0.2 * 0.2;
        double terulet = magassag * szelesseg;
        double darab = terulet / csempe;
        darab = Math.ceil(darab + (darab * 0.10));
        System.out.printf("A munkavégzéshez szükséges csempe mennyisége: %.0f db", darab);
    }
}
