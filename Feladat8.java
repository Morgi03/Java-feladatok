package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        System.out.print("Kérem adja meg a tippjét (0 -fej || 1 -írás): ");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        // véletlen egész szám a és b között: (int)(Math.random() * (b - a +1)) + a
        int feldobas = (int)(Math.random() * 2);
        System.out.printf("A dobás eredménye %s\n", (feldobas == 0) ? "fej" : "írás");
        if (feldobas == tipp) {
            System.out.println("Gratulálok, nyert!");
        } else{
            System.out.println("Sajnos most nem nyert, próbálkozzon újra!");
        }


    }
}
