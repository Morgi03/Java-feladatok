package hu.petrik.javabevezeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy összeget 1 és 1000 között: ");
        int osszeg = sc.nextInt();
        System.out.println("A következő pénzérmékből lehet leggyorsabban kifizetni az összeget: ");
        int i = 0;
        while (osszeg > 0) {

            if (osszeg > 195 && osszeg <= 200) {
                osszeg = osszeg - 200;
                System.out.println("200 Ft");
                continue;
            }
            if (osszeg > 200) {
                osszeg = osszeg - 200;
                System.out.println("200 Ft");
                continue;
            }


            if (osszeg > 95 && osszeg <= 100) {
                osszeg = osszeg - 100;
                System.out.println("100 Ft");
                continue;
            }
            if (osszeg > 100) {
                osszeg = osszeg - 100;
                System.out.println("100 Ft");
                continue;
            }


            if (osszeg > 45 && osszeg <= 50) {
                osszeg = osszeg - 50;
                System.out.println("50 Ft");
                continue;
            }
            if (osszeg > 50) {
                osszeg = osszeg - 50;
                System.out.println("50 Ft");
                continue;
            }


            if (osszeg > 15 && osszeg <= 20) {
                osszeg = osszeg - 20;
                System.out.println("20 Ft");
                continue;
            }
            if (osszeg > 20) {
                osszeg = osszeg - 20;
                System.out.println("20 Ft");
                continue;
            }


            if (osszeg > 5 && osszeg <= 10) {
                osszeg = osszeg - 10;
                System.out.println("10 Ft");
                continue;
            }
            if (osszeg > 50) {
                osszeg = osszeg - 10;
                System.out.println("10 Ft");
                continue;
            }


            if (osszeg >= 1 && osszeg <= 5) {
                osszeg = osszeg - 5;
                System.out.println("5 Ft");
                continue;
            }
            if (osszeg > 5) {
                osszeg = osszeg - 5;
                System.out.println("5 Ft");
            }

        }


    }
}
