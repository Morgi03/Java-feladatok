package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Kérlek add meg hanyadik hónap van: ");
            int honap = sc.nextInt();
            if ((honap <= 2 && honap > 0) || honap == 12 ){System.out.println("A tél évszakban járunk.");}
            if (honap >= 3 && honap <= 5){System.out.println("A tavasz évszakban járunk.");}
            if (honap >= 6 && honap <= 8){System.out.println("A nyár évszakban járunk.");}
            if (honap >= 9 && honap <= 11){System.out.println("Az ősz évszakban járunk.");}
    }
}
