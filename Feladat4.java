package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a háromszög a oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög b oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög c oldalát: ");
        double c = sc.nextDouble();
        boolean ab = a + b > c;
        boolean ac = a + c > b;
        boolean bc = b + c > a;
        if (ab && ac && bc) {
            double k = a + b + c;
            System.out.println("A háromszög kerülete: "+ k);
        } else {
            System.out.println("Hibás adatok");
        }
    }
}
