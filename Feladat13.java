package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        int gondoltszam = (int)(Math.random() * (100 - 1 +1)) + 1;
        int tipp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Kérlek írd be a tipped: ");
            tipp = sc.nextInt();
            if (tipp > gondoltszam){
                System.out.println("A gondolt szám kissebb.");
            } else if (tipp == gondoltszam) {
                System.out.println("Gratulálok kitaláltad a számot, nyertél!");
            } else{
                System.out.println("A gondolt szám nagyobb.");
            }

        } while (gondoltszam != tipp);
    }
}
