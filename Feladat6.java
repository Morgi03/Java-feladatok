package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérlek add meg a dolgozatod pontszámát: ");
         int dolgozat = sc.nextInt();
                 if (dolgozat >= 88 && dolgozat<=100){System.out.println("A dolgozatod eredménye: jeles");}
                 if (dolgozat <= 87 && dolgozat >= 73){System.out.println("A dolgozatod eredménye: jó");}
                 if (dolgozat <= 72 && dolgozat >= 58){System.out.println("A dolgozatod eredménye: közepes");}
                 if (dolgozat <= 57 && dolgozat >= 43){System.out.println("A dolgozatod eredménye: elégséges");}
                 if (dolgozat <= 42 && dolgozat>=0){System.out.println("A dolgozatod eredménye: elégtelen");}
                 if (dolgozat > 100 || dolgozat < 0){System.out.println("Hibás pontszámot adtál meg!");}
    }
}
